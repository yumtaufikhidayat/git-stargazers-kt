package com.taufik.gitstargazers.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.taufik.gitstargazers.R

object GlideImageUtils {
    fun ImageView.loadImage(
        mContext: Context,
        url: String
    ) {
        Glide.with(mContext)
            .load(url)
            .placeholder(R.color.purple_700)
            .error(R.color.purple_700)
            .into(this)
    }
}