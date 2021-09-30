package com.babakbelur.e_maktabah.core.data.repository.islamic

import com.babakbelur.e_maktabah.core.data.source.RemoteDataSource
import com.babakbelur.e_maktabah.core.domain.ResultState
import com.babakbelur.e_maktabah.core.domain.model.Doa
import com.babakbelur.e_maktabah.core.domain.model.Quote
import com.babakbelur.e_maktabah.core.utils.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class IslamicRepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource): IslamicRepository {

    private val _dailyDoa: MutableStateFlow<ResultState<List<Doa>>> = idle()
    override val dailyDoa: StateFlow<ResultState<List<Doa>>>
        get() = _dailyDoa

    private val _randomQuote: MutableStateFlow<ResultState<Quote>> = idle()
    override val randomQuote: StateFlow<ResultState<Quote>>
        get() = _randomQuote

    override suspend fun getDailyDoa() {
        fetch {
            remoteDataSource.getDailyDoa().doaData
        }.map { result ->
            mapResult(result) {
                this.toListDoa()
            }
        }.collect { result ->
            _dailyDoa.value = result
        }
    }

    override suspend fun getRandomQuote() {
        fetch {
            remoteDataSource.getRandomQuote().quoteData
        }.map { result ->
            mapResult(result) {
                this.toQuote()
            }
        }.collect { result ->
            _randomQuote.value = result
        }
    }
}