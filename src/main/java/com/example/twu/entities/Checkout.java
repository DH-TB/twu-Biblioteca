package com.example.twu.entities;

public class Checkout {
    private String userId;
    private int bookId;


    public Checkout(String userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    public String getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }
}
