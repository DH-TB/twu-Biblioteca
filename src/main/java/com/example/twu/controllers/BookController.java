package com.example.twu.controllers;

import com.example.twu.entities.Book;
import com.example.twu.entities.BookList;
import com.example.twu.entities.Checkout;
import com.example.twu.entities.CheckoutList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookController {
    private static BookList bookList = new BookList();
    private static CheckoutList checkoutList = new CheckoutList();

    public static List<Book> initBook() {
        return Arrays.asList(
                new Book(1, "Java", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"),
                new Book(5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社")
        );
    }

    public static void saveBookList() {
        bookList.addBookList(initBook());
    }

    public static String getBookInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$s\n";
        return bookList.getBookList().stream().map(book -> String.format(template,
                book.getId(),
                book.getName(),
                book.getAuthor(),
                book.getYear(),
                book.getPublication())).collect(Collectors.joining());
    }

    public static String checkoutBookById(int id) {
        Book book = bookList.getBookList().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        if (Objects.nonNull(book)) {
            checkoutList.addCheckoutList(new Checkout(1, id));
            bookList.checkoutBook(book);
            return "Thank you! Enjoy the book.";
        }
        return "That book is not available.";
    }

    public static String returnBookById(int id) {
        Checkout checkout = checkoutList.getCheckoutList().stream().filter(c -> c.getBookId() == id && c.getUserId() == 1).findFirst().orElse(null);
        if (Objects.nonNull(checkout)) {
            Book book = initBook().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
            if (Objects.nonNull(book)) {
                bookList.addBook(book);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

}
