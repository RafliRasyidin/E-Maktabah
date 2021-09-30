package com.babakbelur.e_maktabah.core.data.source.local.room

import androidx.room.*
import com.babakbelur.e_maktabah.core.data.source.local.entity.BookEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {

    @Query("SELECT * FROM book")
    fun getAllBook(): Flow<List<BookEntity>>

    @Query("SELECT * FROM book WHERE :query LIKE title")
    fun searchBookByTitle(query: String): Flow<List<BookEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBook(bookEntity: BookEntity)

    @Delete
    suspend fun deleteBook(bookEntity: BookEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateBook(bookEntity: BookEntity)
}