package com.taufik.gitstargazers.ui.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.taufik.gitstargazers.databinding.FragmentMainBinding
import com.taufik.gitstargazers.ui.adapter.LoadMoreAdapter
import com.taufik.gitstargazers.ui.adapter.StargazersAdapter
import com.taufik.gitstargazers.ui.viewmodel.StargazersViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val stargazersViewModel: StargazersViewModel by viewModels()

    @Inject
    lateinit var stargazersAdapter: StargazersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        showData()
    }

    private fun initAdapter() {
        binding.rvStargazersRepository.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
            adapter = stargazersAdapter
        }
    }

    private fun showData() {
        binding.apply {
            lifecycleScope.launchWhenCreated {
                stargazersViewModel.mostStarredRepository.collect {
                    stargazersAdapter.submitData(it)
                }
            }

            stargazersAdapter.setOnItemClickListener {
                try {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it.htmlUrl))
                    startActivity(Intent.createChooser(intent, "Open with"))
                } catch (e: Exception) {
                    Toast.makeText(requireContext(), "Please install browser first to open link", Toast.LENGTH_SHORT).show()
                }
            }

            lifecycleScope.launchWhenCreated {
                stargazersAdapter.loadStateFlow.collect {
                    pbLoading.isVisible = it.refresh is LoadState.Loading
                }
            }

            rvStargazersRepository.adapter = stargazersAdapter.withLoadStateFooter ( LoadMoreAdapter {
                stargazersAdapter.retry()
            })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}