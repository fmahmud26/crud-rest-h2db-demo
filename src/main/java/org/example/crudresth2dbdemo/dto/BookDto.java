package org.example.crudresth2dbdemo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record BookDto(Long id, @NotNull @Size(min = 2, max = 50) String title,
                      @NotNull @Size(min = 2, max = 50) String author) {
}
