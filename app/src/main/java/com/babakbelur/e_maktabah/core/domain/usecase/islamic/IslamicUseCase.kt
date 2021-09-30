package com.babakbelur.e_maktabah.core.domain.usecase.islamic

import com.babakbelur.e_maktabah.core.domain.ResultState
import com.babakbelur.e_maktabah.core.domain.model.Doa
import com.babakbelur.e_maktabah.core.domain.model.Quote
import kotlinx.coroutines.flow.StateFlow

interface IslamicUseCase {

    val dailyDoa: StateFlow<ResultState<List<Doa>>>
    val randomQuote: StateFlow<ResultState<Quote>>

    suspend fun getDailyDoa()

    suspend fun getRandomQuote()
}