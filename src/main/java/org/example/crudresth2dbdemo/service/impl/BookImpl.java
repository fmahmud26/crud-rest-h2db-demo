package org.example.crudresth2dbdemo.service.impl;

import org.example.crudresth2dbdemo.dto.BookDto;
import org.example.crudresth2dbdemo.entity.Book;
import org.example.crudresth2dbdemo.mapper.BookMapper;
import org.example.crudresth2dbdemo.repository.BookRepository;
import org.example.crudresth2dbdemo.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookImpl implements BookService {
    private final BookRepository bookRepository;

    public BookImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDto addBook(BookDto bookDto) {
        Book book = BookMapper.mapToBook(bookDto);
        Book savedBook = bookRepository.save(book);
        return BookMapper.mapToBookDto(savedBook);
    }

    @Override
    public List<BookDto> getBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(BookMapper::mapToBookDto).collect(Collectors.toList());
    }
}
