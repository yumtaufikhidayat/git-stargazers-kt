package com.taufik.gitstargazers.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.taufik.gitstargazers.databinding.ItemRepoStargazersBinding
import com.taufik.gitstargazers.model.response.StargazersItem
import com.taufik.gitstargazers.utils.GlideImageUtils.loadImage
import javax.inject.Inject
import kotlin.math.roundToInt

class StargazersAdapter @Inject constructor(): PagingDataAdapter<StargazersItem, StargazersAdapter.ViewHolder>(diffStargazersCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemRepoStargazersBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        if (data != null) holder.bind(data)
        holder.setIsRecyclable(false)
    }

    inner class ViewHolder(private val binding: ItemRepoStargazersBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: StargazersItem) {
            binding.apply {
                imgUserProfile.loadImage(itemView.context, data.stargazersOwner.avatarUrl)
                tvRepositoryName.text = data.name
                tvRepositoryOwnerName.text = String.format("by %s", data.stargazersOwner.login)
                tvRepositoryDesc.text = data.description

                val sizeStr = data.size.toString().trim()
                val sizeInt = sizeStr.toInt()
                val sizeDouble = sizeInt / 1000.toFloat()
                val sizeIntNew = sizeDouble.roundToInt()

                tvRepositorySize.text = if (sizeIntNew < 1) {
                    val sizeDoubleKb = (sizeDouble * 1000).roundToInt()
                    val sizeIntKb = sizeDoubleKb.toDouble().roundToInt()
                    String.format("%s KB", sizeIntKb)
                } else {
                    String.format("%s MB", sizeIntNew)
                }

                tvRepositoryStarred.text = data.stargazersCount.toString()
                tvRepositoryLanguage.text = data.language ?: "N/A"

                itemView.setOnClickListener {
                    onItemClickListener?.let { it(data) }
                }
            }
        }
    }

    companion object {
        private val diffStargazersCallback = object : DiffUtil.ItemCallback<StargazersItem>() {
            override fun areItemsTheSame(oldItem: StargazersItem, newItem: StargazersItem): Boolean = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: StargazersItem, newItem: StargazersItem): Boolean = oldItem == newItem
        }
    }

    private var onItemClickListener: ((StargazersItem) -> Unit)? = null
    fun setOnItemClickListener(listener: (StargazersItem) -> Unit) {
        onItemClickListener = listener
    }
}