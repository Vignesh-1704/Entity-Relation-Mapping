package com.m2p.Relationship.dto.responseDtos;

import com.m2p.Relationship.model.Author;
import lombok.Data;

import java.util.List;

@Data
public class BookResponseDto {
    private Long id;
    private String name;
    private List<Author> authorNames;
    private String categoryName;
}
