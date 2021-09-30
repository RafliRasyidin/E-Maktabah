package com.babakbelur.e_maktabah.core.data.source.local

import com.babakbelur.e_maktabah.core.data.source.local.room.BookDao
import javax.inject.Inject

class BookLocalDataSourceImpl @Inject constructor(bookDao: BookDao) :
    BookLocalDataSource {
}