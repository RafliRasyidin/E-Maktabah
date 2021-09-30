package com.babakbelur.e_maktabah.core.data.repository.book

import com.babakbelur.e_maktabah.core.data.source.local.BookLocalDataSourceImpl
import javax.inject.Inject

class BookRepositoryImpl @Inject constructor(bookLocalDataSource: BookLocalDataSourceImpl) :
    BookRepository {
}