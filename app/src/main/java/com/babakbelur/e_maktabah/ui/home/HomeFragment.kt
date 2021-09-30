package com.babakbelur.e_maktabah.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.babakbelur.e_maktabah.core.utils.onFailure
import com.babakbelur.e_maktabah.core.utils.onSuccess
import com.babakbelur.e_maktabah.databinding.FragmentHomeBinding
import com.babakbelur.e_maktabah.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeRandomQuote()

        onQuoteClicked()
    }

    private fun onQuoteClicked() {
        binding.quoteContainer.cardQuote.setOnClickListener {
            observeRandomQuote()
        }
    }

    private fun observeRandomQuote() {
        homeViewModel.getRandomQuote()
        homeViewModel.randomQuote.observe(viewLifecycleOwner) { result ->

            result.onSuccess { quote ->
                binding.quoteContainer.tvQuote.text = quote.quote
            }

            result.onFailure { throwable ->
                Log.e(HomeFragment::class.simpleName, throwable.message.toString())
                Toast.makeText(requireActivity(), "Something Wrong", Toast.LENGTH_SHORT).show()
            }
        }
    }

}