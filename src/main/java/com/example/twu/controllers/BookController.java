package com.example.twu.controllers;

import com.example.twu.DataList;
import com.example.twu.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookController {
    private DataList dataList = new DataList();

    public static List<Book> initBook() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "Java", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.add(new Book(5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社"));
        return bookList;
    }

    public String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return DataList.getBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }


    public String checkoutBookById(int id) {
        Book book = DataList.getBookList().stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(book)) {
            dataList.addCheckoutBookList(new CheckoutBook(DataList.getLoggedUser().getId(), id));
            dataList.checkoutBook(book);
            return "Thank you! Enjoy the book.";
        }
        return "That book is not available.";
    }

    public String returnBookById(int id) {
        CheckoutBook checkout = DataList.getCheckoutBookList().stream()
                .filter(c -> c.getBookId() == id && c.getUserId().equals(DataList.getLoggedUser().getId()))
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(checkout)) {
            Book book = initBook().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
            if (Objects.nonNull(book)) {
                dataList.addBook(book);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

}
