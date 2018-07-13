package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }
}
