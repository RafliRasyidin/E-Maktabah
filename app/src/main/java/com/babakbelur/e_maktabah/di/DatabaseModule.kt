package com.babakbelur.e_maktabah.di

import android.content.Context
import androidx.room.Room
import com.babakbelur.e_maktabah.data.source.local.room.BookDatabase
import com.babakbelur.e_maktabah.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesBookDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            BookDatabase::class.java,
            DATABASE_NAME
        ).build()
}