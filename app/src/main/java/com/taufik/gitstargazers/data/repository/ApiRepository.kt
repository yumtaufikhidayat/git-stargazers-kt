package com.taufik.gitstargazers.data.repository

import com.taufik.gitstargazers.data.remote.api.ApiService
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getMostStarredRepository(
        query: String,
        sort: String,
        order: String,
        page: Int,
        perPage: Int
    ) = apiService.getMostStarredRepository(query, sort, order, page, perPage)
}