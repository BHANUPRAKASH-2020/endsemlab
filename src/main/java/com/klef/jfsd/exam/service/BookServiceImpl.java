package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repositry.BookRepositry;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
    private BookRepositry bookRepository;

	@Override
	public Book updateBook(Book updatedBook) {
		 return bookRepository.save(updatedBook);
	}

	@Override
	public Optional<Book> findBookById(Long bookId) {
		return bookRepository.findById(bookId);
	}

	@Override
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(Long bookId) {
		 bookRepository.deleteById(bookId);
		
	}


}
