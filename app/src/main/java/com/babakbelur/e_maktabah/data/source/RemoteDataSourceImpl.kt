package com.babakbelur.e_maktabah.data.source

import com.babakbelur.e_maktabah.data.source.remote.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val apiService: ApiService) :
    RemoteDataSource {
}