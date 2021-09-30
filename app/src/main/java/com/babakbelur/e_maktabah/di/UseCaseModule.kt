package com.babakbelur.e_maktabah.di

import com.babakbelur.e_maktabah.core.data.repository.islamic.IslamicRepository
import com.babakbelur.e_maktabah.core.domain.usecase.islamic.IslamicInteractors
import com.babakbelur.e_maktabah.core.domain.usecase.islamic.IslamicUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun providesIslamicUseCase(islamicRepository: IslamicRepository): IslamicUseCase =
        IslamicInteractors(islamicRepository)
}