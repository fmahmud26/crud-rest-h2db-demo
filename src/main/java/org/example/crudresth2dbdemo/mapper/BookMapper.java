package org.example.crudresth2dbdemo.mapper;

import org.example.crudresth2dbdemo.dto.BookDto;
import org.example.crudresth2dbdemo.entity.Book;

public class BookMapper {
    public static Book mapToBook(BookDto bookDto) {
        return new Book(bookDto.id(), bookDto.title(), bookDto.author());
    }

    public static BookDto mapToBookDto(Book book) {
        return new BookDto(book.getId(), book.getTitle(), book.getAuthor());
    }
}
