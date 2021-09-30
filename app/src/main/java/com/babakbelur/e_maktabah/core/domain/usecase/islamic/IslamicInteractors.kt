package com.babakbelur.e_maktabah.core.domain.usecase.islamic

import com.babakbelur.e_maktabah.core.data.repository.islamic.IslamicRepository
import com.babakbelur.e_maktabah.core.domain.ResultState
import com.babakbelur.e_maktabah.core.domain.model.Doa
import com.babakbelur.e_maktabah.core.domain.model.Quote
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class IslamicInteractors @Inject constructor(private val islamicRepository: IslamicRepository): IslamicUseCase {

    override val dailyDoa: StateFlow<ResultState<List<Doa>>>
        get() = islamicRepository.dailyDoa

    override val randomQuote: StateFlow<ResultState<Quote>>
        get() = islamicRepository.randomQuote

    override suspend fun getDailyDoa() {
        islamicRepository.getDailyDoa()
    }

    override suspend fun getRandomQuote() {
        islamicRepository.getRandomQuote()
    }
}