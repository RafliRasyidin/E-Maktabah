package com.babakbelur.e_maktabah.core.data.source

import com.babakbelur.e_maktabah.core.data.source.remote.network.ApiService
import com.babakbelur.e_maktabah.core.data.source.remote.response.DailyDoaResponse
import com.babakbelur.e_maktabah.core.data.source.remote.response.QuoteResponse
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: ApiService) :
    RemoteDataSource {

    override suspend fun getDailyDoa(): DailyDoaResponse {
        return apiService.getDailyDoa()
    }

    override suspend fun getRandomQuote(): QuoteResponse {
        return apiService.getRandomQuote()
    }
}