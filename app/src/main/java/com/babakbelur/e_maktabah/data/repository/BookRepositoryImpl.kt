package com.babakbelur.e_maktabah.data.repository

import com.babakbelur.e_maktabah.data.source.RemoteDataSource
import com.babakbelur.e_maktabah.data.source.RemoteDataSourceImpl
import javax.inject.Inject

class BookRepositoryImpl @Inject constructor(remoteDataSource: RemoteDataSourceImpl) : BookRepository {
}