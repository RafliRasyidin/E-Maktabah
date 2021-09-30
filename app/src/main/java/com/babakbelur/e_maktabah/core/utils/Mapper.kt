package com.babakbelur.e_maktabah.core.utils

import com.babakbelur.e_maktabah.core.data.source.remote.response.DoaData
import com.babakbelur.e_maktabah.core.data.source.remote.response.QuoteData
import com.babakbelur.e_maktabah.core.domain.ResultState
import com.babakbelur.e_maktabah.core.domain.model.Doa
import com.babakbelur.e_maktabah.core.domain.model.Quote

inline fun <T: Any, U: Any> mapResult(
    resultState: ResultState<out T>,
    mapper: T.() -> U
): ResultState<U> {
    return when (resultState) {
        is ResultState.Success -> {
            val data = resultState.data
            val mapData = mapper.invoke(data)
            ResultState.Success(mapData)
        }
        is ResultState.Error -> ResultState.Error(resultState.throwable)
        is ResultState.Idle -> ResultState.Idle()
        is ResultState.Loading -> ResultState.Loading()
    }
}

fun List<DoaData>.toListDoa(): List<Doa> {
    val data = ArrayList<Doa>()
    this.map {
        val doa = Doa(
            arab = it.arab,
            latin = it.latin,
            doaTitle = it.doaTitle,
            translate = it.translate
        )
        data.add(doa)
    }
    return data
}

fun QuoteData.toQuote() = Quote(
    quote
)