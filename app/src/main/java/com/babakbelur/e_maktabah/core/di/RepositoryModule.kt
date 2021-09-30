package com.babakbelur.e_maktabah.core.di

import com.babakbelur.e_maktabah.core.data.repository.islamic.IslamicRepository
import com.babakbelur.e_maktabah.core.data.repository.islamic.IslamicRepositoryImpl
import com.babakbelur.e_maktabah.core.data.source.RemoteDataSource
import com.babakbelur.e_maktabah.core.data.source.RemoteDataSourceImpl
import com.babakbelur.e_maktabah.core.data.source.remote.network.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesRemoteDataSource(apiService: ApiService): RemoteDataSource =
        RemoteDataSourceImpl(apiService)

    @Provides
    @Singleton
    fun providesIslamicRepository(remoteDataSource: RemoteDataSource): IslamicRepository =
        IslamicRepositoryImpl(remoteDataSource)

}