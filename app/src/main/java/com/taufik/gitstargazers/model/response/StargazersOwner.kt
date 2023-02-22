package com.taufik.gitstargazers.model.response


import com.google.gson.annotations.SerializedName

data class StargazersOwner(
    @SerializedName("avatar_url")
    val avatarUrl: String = "", // https://avatars.githubusercontent.com/u/9280406?v=4
    @SerializedName("events_url")
    val eventsUrl: String = "", // https://api.github.com/users/glassechidna/events{/privacy}
    @SerializedName("followers_url")
    val followersUrl: String = "", // https://api.github.com/users/glassechidna/followers
    @SerializedName("following_url")
    val followingUrl: String = "", // https://api.github.com/users/glassechidna/following{/other_user}
    @SerializedName("gists_url")
    val gistsUrl: String = "", // https://api.github.com/users/glassechidna/gists{/gist_id}
    @SerializedName("gravatar_id")
    val gravatarId: String = "",
    @SerializedName("html_url")
    val htmlUrl: String = "", // https://github.com/glassechidna
    @SerializedName("id")
    val id: Int = 0, // 9280406
    @SerializedName("login")
    val login: String = "", // glassechidna
    @SerializedName("node_id")
    val nodeId: String = "", // MDEyOk9yZ2FuaXphdGlvbjkyODA0MDY=
    @SerializedName("organizations_url")
    val organizationsUrl: String = "", // https://api.github.com/users/glassechidna/orgs
    @SerializedName("received_events_url")
    val receivedEventsUrl: String = "", // https://api.github.com/users/glassechidna/received_events
    @SerializedName("repos_url")
    val reposUrl: String = "", // https://api.github.com/users/glassechidna/repos
    @SerializedName("site_admin")
    val siteAdmin: Boolean = false, // false
    @SerializedName("starred_url")
    val starredUrl: String = "", // https://api.github.com/users/glassechidna/starred{/owner}{/repo}
    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String = "", // https://api.github.com/users/glassechidna/subscriptions
    @SerializedName("type")
    val type: String = "", // Organization
    @SerializedName("url")
    val url: String = "" // https://api.github.com/users/glassechidna
)