package com.babakbelur.e_maktabah.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class QuoteResponse(
    @SerializedName("data")
    val quoteData: QuoteData
)

data class QuoteData(
    @SerializedName("quote")
    val quote: String
)