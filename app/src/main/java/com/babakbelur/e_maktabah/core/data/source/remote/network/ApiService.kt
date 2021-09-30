package com.babakbelur.e_maktabah.core.data.source.remote.network

import com.babakbelur.e_maktabah.core.data.source.remote.response.DailyDoaResponse
import com.babakbelur.e_maktabah.core.data.source.remote.response.QuoteResponse
import retrofit2.http.GET

interface ApiService {

    @GET("/api/v1/doaharian")
    suspend fun getDailyDoa(): DailyDoaResponse

    @GET("/api/v1/quote")
    suspend fun getRandomQuote(): QuoteResponse
}