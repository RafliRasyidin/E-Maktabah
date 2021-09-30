package com.babakbelur.e_maktabah.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class DailyDoaResponse(
    @SerializedName("data")
    val doaData: List<DoaData>,
)

data class DoaData(
    @SerializedName("arab")
    val arab: String,

    @SerializedName("latin")
    val latin: String,

    @SerializedName("nama")
    val doaTitle: String,

    @SerializedName("terjemahan")
    val translate: String
)