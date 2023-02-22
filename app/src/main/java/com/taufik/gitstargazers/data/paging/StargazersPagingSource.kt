package com.taufik.gitstargazers.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.taufik.gitstargazers.data.repository.ApiRepository
import com.taufik.gitstargazers.model.response.StargazersItem
import retrofit2.HttpException

class StargazersPagingSource(
    private val apiRepository: ApiRepository
): PagingSource<Int, StargazersItem>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, StargazersItem> {
        return try {
            val query = "created:>2021-01-01"
            val sort = "stars"
            val order = "desc"
            val currentPage = params.key ?: 1
            val perPage = 10
            val response = apiRepository.getMostStarredRepository(
                query, sort, order, currentPage, perPage
            )
            val data = response.body()?.stargazersItems
            val responseData = mutableListOf<StargazersItem>()
            if (data != null) responseData.addAll(data)

            LoadResult.Page(
                data = responseData,
                prevKey = if (currentPage == 1) null else -1,
                nextKey = currentPage.plus(1)
            )
        } catch (httpEx: HttpException) {
            LoadResult.Error(httpEx)
        } catch (ex: Exception) {
            LoadResult.Error(ex)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, StargazersItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}