package com.example.twu;

import com.example.twu.entities.Book;
import com.example.twu.entities.Checkout;
import com.example.twu.entities.Movie;
import com.example.twu.entities.User;

import java.util.ArrayList;
import java.util.List;

public class DataList {
    private static List<Book> bookList = new ArrayList<>();
    private static List<Checkout> checkoutList = new ArrayList<>();
    private static List<Movie> movieList = new ArrayList<>();
    private static List<User> userList = new ArrayList<>();
    private static User loggedUser;

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(User user) {
        loggedUser = user;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void addUserList(List<User> user) {
        userList.addAll(user);
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static void addBookList(List<Book> book) {
        bookList.addAll(book);
    }

    public static void checkoutBook(Book book) {
        bookList.remove(book);
    }

    public static List<Checkout> getCheckoutList() {
        return checkoutList;
    }

    public static void addCheckoutList(Checkout list) {
        checkoutList.add(list);
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static void addMovieList(List<Movie> movie) {
        movieList.addAll(movie);
    }
}
