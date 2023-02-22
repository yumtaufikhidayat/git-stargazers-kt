package com.taufik.gitstargazers.data.remote.api

import com.taufik.gitstargazers.model.response.StargazersListResponse
import com.taufik.gitstargazers.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(Constants.MOST_STARRED_REPOS)
    suspend fun getMostStarredRepository(
        @Query("q") query: String, // q=created:>2023-01-01
        @Query("sort") sort: String,
        @Query("order") order: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Response<StargazersListResponse>
}