package com.m2p.Relationship.dto.requestDtos;

import lombok.Data;

import java.util.List;

@Data
public class BookRequestDto {
    private String name;
    private List<Long> authorsList;
    private Long categoryId;
}
