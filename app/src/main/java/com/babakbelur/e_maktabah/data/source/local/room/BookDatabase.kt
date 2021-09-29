package com.babakbelur.e_maktabah.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.babakbelur.e_maktabah.data.source.local.entity.BookEntity

@Database(entities = [BookEntity::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract fun getBookDao(): BookDao
}