package com.example.twu.store;

import com.example.twu.entities.*;

import java.util.ArrayList;
import java.util.List;

public class DataList {

    private User loggedUser;
    private List<Book> bookList;
    private List<Movie> movieList;
    private List<User> userList;
    private List<CheckoutBook> checkoutBookList = new ArrayList<>();
    private List<CheckoutMovie> checkoutMovieList = new ArrayList<>();

    public DataList() {
        InitData initData = new InitData();
        this.bookList = initData.bookList();
        this.movieList = initData.movieList();
        this.userList = initData.userList();
    }



    public User getLoggedUser() {
        return loggedUser;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<CheckoutBook> getCheckoutBookList() {
        return checkoutBookList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setLoggedUser(User user) {
        loggedUser = user;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void checkoutBook(Book book) {
        bookList.remove(book);
    }

    public void checkoutMovie(Movie movie) {
        movieList.remove(movie);
    }

    public void addCheckoutBookList(CheckoutBook list) {
        checkoutBookList.add(list);
    }

    public void addCheckoutMovieList(CheckoutMovie list) {
        checkoutMovieList.add(list);
    }
}
