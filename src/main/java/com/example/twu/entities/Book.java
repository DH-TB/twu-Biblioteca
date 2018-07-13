package com.example.twu.entities;

public class Book {
    private Long id;
    private String name;
    private String author;
    private String year;
    private String publication;


    public Book(Long id, String name, String author, String year, String publication) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.publication = publication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
