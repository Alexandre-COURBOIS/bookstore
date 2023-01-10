package com.nfs.bookstore.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbook")
    private int id;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idauthor")
    private Author author;
    private LocalDateTime releaseYear;

    public Book() {}

    public Book(int id, String title, Author author, LocalDateTime releaseYear) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDateTime getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(LocalDateTime releaseYear) {
        this.releaseYear = releaseYear;
    }
}
