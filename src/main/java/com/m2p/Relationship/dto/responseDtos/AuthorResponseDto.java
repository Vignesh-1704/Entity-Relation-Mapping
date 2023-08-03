package com.m2p.Relationship.dto.responseDtos;

import com.m2p.Relationship.model.Book;
import lombok.Data;

import java.util.List;

@Data
public class AuthorResponseDto {
    private Long id;
    private String name;
    private List<Book> bookNames;
    private String zipCode;
}
