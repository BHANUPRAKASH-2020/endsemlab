package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book updateBook(Book updatedBook);
    Optional<Book> findBookById(Long bookId);
    List<Book> findAllBooks();
    void deleteBook(Long bookId);
}
