package com.babakbelur.e_maktabah.core.data.source

import com.babakbelur.e_maktabah.core.data.source.remote.response.DailyDoaResponse
import com.babakbelur.e_maktabah.core.data.source.remote.response.QuoteResponse

interface RemoteDataSource {

    suspend fun getDailyDoa(): DailyDoaResponse

    suspend fun getRandomQuote(): QuoteResponse
}