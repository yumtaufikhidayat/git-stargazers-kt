package com.taufik.gitstargazers.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.taufik.gitstargazers.data.paging.StargazersPagingSource
import com.taufik.gitstargazers.data.repository.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StargazersViewModel @Inject constructor(private val apiRepository: ApiRepository): ViewModel() {
    val mostStarredRepository = Pager(PagingConfig(1)) {
        StargazersPagingSource(apiRepository)
    }.flow.cachedIn(viewModelScope)
}