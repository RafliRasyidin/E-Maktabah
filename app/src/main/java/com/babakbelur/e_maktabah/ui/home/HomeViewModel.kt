package com.babakbelur.e_maktabah.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.babakbelur.e_maktabah.core.domain.usecase.islamic.IslamicUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val islamicUseCase: IslamicUseCase) : ViewModel() {

    val dailyDoa = islamicUseCase.dailyDoa.asLiveData(viewModelScope.coroutineContext)

    val randomQuote = islamicUseCase.randomQuote.asLiveData(viewModelScope.coroutineContext)

    fun getDailyDoa() = viewModelScope.launch {
        islamicUseCase.getDailyDoa()
    }

    fun getRandomQuote() = viewModelScope.launch {
        islamicUseCase.getRandomQuote()
    }

}