package com.example.twu.actions;

import com.example.twu.entities.Book;
import com.example.twu.entities.CheckoutBook;
import com.example.twu.store.InitData;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class ReturnBookAction {

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
