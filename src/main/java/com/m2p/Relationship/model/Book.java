package com.m2p.Relationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authorList = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    public void addAuthor(Author author)
    {
        authorList.add(author);
    }

    public void removeAuthor(Author author)
    {
        authorList.remove(author);
    }
}

// By encapsulating the addition and removal of authors in the entity class,
// you ensure that both sides of the relationship are updated correctly.
// This helps to prevent inconsistencies in the relationship,
// such as having an Author associated with a Book but the Book not being associated with the same Author.
