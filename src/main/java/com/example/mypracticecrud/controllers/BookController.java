package com.example.mypracticecrud.controllers;

import com.example.mypracticecrud.entities.Book;
import com.example.mypracticecrud.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book){
        Book existingBook = getBookById(id);
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        return bookRepository.save(existingBook);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
    }
}
