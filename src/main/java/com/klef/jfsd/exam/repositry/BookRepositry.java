package com.klef.jfsd.exam.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.exam.model.Book;

public interface BookRepositry extends JpaRepository<Book, Long> {
	
}