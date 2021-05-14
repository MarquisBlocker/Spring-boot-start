package com.tts.Spring.boot.start.controller;

import com.tts.Spring.boot.start.exceptions.BookIdMismatchException;
import com.tts.Spring.boot.start.exceptions.BookNotFoundException;
import com.tts.Spring.boot.start.model.Book;
import com.tts.Spring.boot.start.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    // this is a form of dependency injection
    // we are allowing BookController to pick up a candidate for this field
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List<Book> findByTitle(@PathVariable String bookTitle) {
        return bookRepository.findByTitle(bookTitle);
    }


}
