package com.taufik.gitstargazers.model.response


import com.google.gson.annotations.SerializedName

data class StargazersItem(
    @SerializedName("allow_forking")
    val allowForking: Boolean = false, // true
    @SerializedName("archive_url")
    val archiveUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/{archive_format}{/ref}
    @SerializedName("archived")
    val archived: Boolean = false, // false
    @SerializedName("assignees_url")
    val assigneesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/assignees{/user}
    @SerializedName("blobs_url")
    val blobsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/git/blobs{/sha}
    @SerializedName("branches_url")
    val branchesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/branches{/branch}
    @SerializedName("clone_url")
    val cloneUrl: String = "", // https://github.com/glassechidna/actions2aws.git
    @SerializedName("collaborators_url")
    val collaboratorsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/collaborators{/collaborator}
    @SerializedName("comments_url")
    val commentsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/comments{/number}
    @SerializedName("commits_url")
    val commitsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/commits{/sha}
    @SerializedName("compare_url")
    val compareUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/compare/{base}...{head}
    @SerializedName("contents_url")
    val contentsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/contents/{+path}
    @SerializedName("contributors_url")
    val contributorsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/contributors
    @SerializedName("created_at")
    val createdAt: String = "", // 2021-02-28T04:22:13Z
    @SerializedName("default_branch")
    val defaultBranch: String = "", // main
    @SerializedName("deployments_url")
    val deploymentsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/deployments
    @SerializedName("description")
    val description: String = "", // Assume AWS IAM roles from GitHub Actions workflows with no stored secrets
    @SerializedName("disabled")
    val disabled: Boolean = false, // false
    @SerializedName("downloads_url")
    val downloadsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/downloads
    @SerializedName("events_url")
    val eventsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/events
    @SerializedName("fork")
    val fork: Boolean = false, // false
    @SerializedName("forks")
    val forks: Int = 0, // 6
    @SerializedName("forks_count")
    val forksCount: Int = 0, // 6
    @SerializedName("forks_url")
    val forksUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/forks
    @SerializedName("full_name")
    val fullName: String = "", // glassechidna/actions2aws
    @SerializedName("git_commits_url")
    val gitCommitsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/git/commits{/sha}
    @SerializedName("git_refs_url")
    val gitRefsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/git/refs{/sha}
    @SerializedName("git_tags_url")
    val gitTagsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/git/tags{/sha}
    @SerializedName("git_url")
    val gitUrl: String = "", // git://github.com/glassechidna/actions2aws.git
    @SerializedName("has_discussions")
    val hasDiscussions: Boolean = false, // false
    @SerializedName("has_downloads")
    val hasDownloads: Boolean = false, // true
    @SerializedName("has_issues")
    val hasIssues: Boolean = false, // true
    @SerializedName("has_pages")
    val hasPages: Boolean = false, // false
    @SerializedName("has_projects")
    val hasProjects: Boolean = false, // true
    @SerializedName("has_wiki")
    val hasWiki: Boolean = false, // true
    @SerializedName("homepage")
    val homepage: String? = null, // null
    @SerializedName("hooks_url")
    val hooksUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/hooks
    @SerializedName("html_url")
    val htmlUrl: String = "", // https://github.com/glassechidna/actions2aws
    @SerializedName("id")
    val id: Int = 0, // 343019126
    @SerializedName("is_template")
    val isTemplate: Boolean = false, // false
    @SerializedName("issue_comment_url")
    val issueCommentUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/issues/comments{/number}
    @SerializedName("issue_events_url")
    val issueEventsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/issues/events{/number}
    @SerializedName("issues_url")
    val issuesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/issues{/number}
    @SerializedName("keys_url")
    val keysUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/keys{/key_id}
    @SerializedName("labels_url")
    val labelsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/labels{/name}
    @SerializedName("language")
    val language: String? = null, // null
    @SerializedName("languages_url")
    val languagesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/languages
    @SerializedName("license")
    val license: StargazersLicense? = null, // null
    @SerializedName("merges_url")
    val mergesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/merges
    @SerializedName("milestones_url")
    val milestonesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/milestones{/number}
    @SerializedName("mirror_url")
    val mirrorUrl: String? = null, // null
    @SerializedName("name")
    val name: String = "", // actions2aws
    @SerializedName("node_id")
    val nodeId: String = "", // MDEwOlJlcG9zaXRvcnkzNDMwMTkxMjY=
    @SerializedName("notifications_url")
    val notificationsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/notifications{?since,all,participating}
    @SerializedName("open_issues")
    val openIssues: Int = 0, // 2
    @SerializedName("open_issues_count")
    val openIssuesCount: Int = 0, // 2
    @SerializedName("owner")
    val stargazersOwner: StargazersOwner = StargazersOwner(),
    @SerializedName("private")
    val `private`: Boolean = false, // false
    @SerializedName("pulls_url")
    val pullsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/pulls{/number}
    @SerializedName("pushed_at")
    val pushedAt: String = "", // 2021-09-29T23:26:50Z
    @SerializedName("releases_url")
    val releasesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/releases{/id}
    @SerializedName("score")
    val score: Double = 0.0, // 1.0
    @SerializedName("size")
    val size: Int = 0, // 107
    @SerializedName("ssh_url")
    val sshUrl: String = "", // git@github.com:glassechidna/actions2aws.git
    @SerializedName("stargazers_count")
    val stargazersCount: Int = 0, // 171
    @SerializedName("stargazers_url")
    val stargazersUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/stargazers
    @SerializedName("statuses_url")
    val statusesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/statuses/{sha}
    @SerializedName("subscribers_url")
    val subscribersUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/subscribers
    @SerializedName("subscription_url")
    val subscriptionUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/subscription
    @SerializedName("svn_url")
    val svnUrl: String = "", // https://github.com/glassechidna/actions2aws
    @SerializedName("tags_url")
    val tagsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/tags
    @SerializedName("teams_url")
    val teamsUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/teams
    @SerializedName("topics")
    val topics: List<Any> = listOf(),
    @SerializedName("trees_url")
    val treesUrl: String = "", // https://api.github.com/repos/glassechidna/actions2aws/git/trees{/sha}
    @SerializedName("updated_at")
    val updatedAt: String = "", // 2022-02-12T20:01:43Z
    @SerializedName("url")
    val url: String = "", // https://api.github.com/repos/glassechidna/actions2aws
    @SerializedName("visibility")
    val visibility: String = "", // public
    @SerializedName("watchers")
    val watchers: Int = 0, // 171
    @SerializedName("watchers_count")
    val watchersCount: Int = 0, // 171
    @SerializedName("web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean = false // false
)