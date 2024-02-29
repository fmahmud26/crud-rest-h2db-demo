package org.example.crudresth2dbdemo.controller;


import jakarta.validation.Valid;
import org.example.crudresth2dbdemo.dto.BookDto;
import org.example.crudresth2dbdemo.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public ResponseEntity<BookDto> addBook(@Valid @RequestBody BookDto bookDto) {
        return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.CREATED);
    }

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        List<BookDto> bookDtos = bookService.getBooks();
        return ResponseEntity.ok(bookDtos);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("id") Long id) {
        // Todo
        return null;
    }


    @PutMapping("/book/{id}")
    public ResponseEntity<BookDto> updateBookById(@PathVariable("id") Long id) {
        // Todo
        return null;
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
        // Todo
        return null;
    }
}
