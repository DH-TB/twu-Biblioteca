package com.example.twu.controllers;

import com.example.twu.entities.*;
import com.example.twu.store.InitData;

import java.util.Objects;
import java.util.stream.Collectors;

import static com.example.twu.Application.dataList;

public class BookController {

    public String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return dataList.getBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }


    public String checkoutBookById(int id) {
        Book book = dataList.getBookList().stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(book)) {
            dataList.addCheckoutBookList(new CheckoutBook(dataList.getLoggedUser().getId(), id));
            dataList.checkoutBook(book);
            return "Thank you! Enjoy the book.";
        }
        return "That book is not available.";
    }

    public String returnBookById(int id) {
        CheckoutBook checkout = dataList.getCheckoutBookList().stream()
                .filter(c -> c.getBookId() == id && c.getUserId().equals(dataList.getLoggedUser().getId()))
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(checkout)) {
            InitData initData = new InitData();

            Book book = initData.bookList().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
            if (Objects.nonNull(book)) {
                dataList.addBook(book);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

}
