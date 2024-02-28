package org.example.crudresth2dbdemo.service;


import org.example.crudresth2dbdemo.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto addBook(BookDto bookDto);

    List<BookDto> getBooks();
}
