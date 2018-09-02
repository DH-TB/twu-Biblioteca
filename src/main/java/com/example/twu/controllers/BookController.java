package com.example.twu.controllers;

import com.example.twu.DataList;
import com.example.twu.entities.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookController {

    private static List<Book> initBook() {
        return Arrays.asList(
                new Book(1, "Java", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社")
        );
    }

    public static void saveBookList() {
        DataList.addBookList(initBook());
    }

    public static String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return DataList.getBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }


    public static String checkoutBookById(int id) {
        Book book = DataList.getBookList().stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(book)) {
            DataList.addCheckoutBookList(new CheckoutBook(DataList.getLoggedUser().getId(), id));
            DataList.checkoutBook(book);
            return "Thank you! Enjoy the book.";
        }
        return "That book is not available.";
    }

    public static String returnBookById(int id) {
        CheckoutBook checkout = DataList.getCheckoutBookList().stream()
                .filter(c -> c.getBookId() == id && c.getUserId().equals(DataList.getLoggedUser().getId()))
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(checkout)) {
            Book book = initBook().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
            if (Objects.nonNull(book)) {
                DataList.addBook(book);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

}
