package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/viewall")
    public ModelAndView viewAllBooks() {
        ModelAndView mv = new ModelAndView("viewallbooks");
        mv.addObject("books", bookService.findAllBooks());
        return mv;
    }


    @PostMapping("/updatebook")
    public String updateBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/viewallbooks"; 
    }



    @GetMapping("/delete")
    public String deleteBook(@RequestParam("id") Long bookId) {
        bookService.deleteBook(bookId);
        return "redirect:/books/viewall";
    }
}
