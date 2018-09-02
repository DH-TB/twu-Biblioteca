package com.example.twu;

import com.example.twu.entities.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.twu.controllers.BookController.initBook;
import static com.example.twu.controllers.MovieController.initMovie;
import static com.example.twu.controllers.UserController.initUser;

public class DataList {
    private static List<Book> bookList = initBook();
    private static List<Movie> movieList = initMovie();
    private List<User> userList = initUser();

    private static List<CheckoutBook> checkoutBookList = new ArrayList<>();
    private List<CheckoutMovie> checkoutMovieList = new ArrayList<>();

    private static User loggedUser;

    public static User getLoggedUser() {
        return loggedUser;
    }

    public static List<Movie> getMovieList() {
        return movieList;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public static List<CheckoutBook> getCheckoutBookList() {
        return checkoutBookList;
    }

    public void setLoggedUser(User user) {
        loggedUser = user;
    }

    public List<User> getUserList() {
        return userList;
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
