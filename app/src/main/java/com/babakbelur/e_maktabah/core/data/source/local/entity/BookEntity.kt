package com.babakbelur.e_maktabah.core.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book")
data class BookEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_book")
    val idBook: Int = 0,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "file_path")
    val filePath: String

)
