package com.example.twu.actions;

import com.example.twu.entities.Book;
import com.example.twu.entities.CheckoutBook;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class CheckoutBookAction {
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
}
