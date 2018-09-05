package com.example.twu.store;

import com.example.twu.entities.Book;
import com.example.twu.entities.Movie;
import com.example.twu.entities.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitData {

    List<User> userList() {
        return Arrays.asList(
                new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"),
                new User("222-2222", "user2", "pass2", "929659475@qq.com", "15091671302", "xi'an"),
                new User("333-3333", "user3", "pass3", "929659475@qq.com", "15091671302", "xi'an"),
                new User("444-4444", "user4", "pass4", "929659475@qq.com", "15091671302", "xi'an"),
                new User("555-5555", "user5", "pass5", "929659475@qq.com", "15091671302", "xi'an")
        );
    }

    List<Movie> movieList() {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "movie1", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(2, "movie2", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(3, "movie3", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(4, "movie4", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(5, "movie5", "2018/3/16", "huanglizhen", 10));
        return movieList;
    }

    public List<Book> bookList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Java", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社"));
        return bookList;
    }
}
