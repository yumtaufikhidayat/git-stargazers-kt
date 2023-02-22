package com.taufik.gitstargazers.model.response


import com.google.gson.annotations.SerializedName

data class StargazersListResponse(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean = false, // true
    @SerializedName("items")
    val stargazersItems: List<StargazersItem> = listOf(),
    @SerializedName("total_count")
    val totalCount: Int = 0 // 24024036
)