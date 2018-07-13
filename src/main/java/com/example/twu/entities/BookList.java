package com.example.twu.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void addBookList(List<Book> book) {
        this.bookList.addAll(book);
    }

    public void checkoutBook(Book book) {
        this.bookList.remove(book);
    }
}
