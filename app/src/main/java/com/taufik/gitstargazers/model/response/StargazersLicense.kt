package com.taufik.gitstargazers.model.response


import com.google.gson.annotations.SerializedName

data class StargazersLicense(
    @SerializedName("key")
    val key: String = "", // mit
    @SerializedName("name")
    val name: String = "", // MIT License
    @SerializedName("node_id")
    val nodeId: String = "", // MDc6TGljZW5zZTEz
    @SerializedName("spdx_id")
    val spdxId: String = "", // MIT
    @SerializedName("url")
    val url: String = "" // https://api.github.com/licenses/mit
)