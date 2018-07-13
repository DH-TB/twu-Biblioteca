package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Data {
    private static BookList bookList = new BookList();
    private static CheckoutList checkoutList = new CheckoutList();

    public static void saveBookList() {
        bookList.addBook(new Book(1, "Java", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.addBook(new Book(2, "TDD", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.addBook(new Book(3, "Refactor", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.addBook(new Book(4, "Pair Programing", "TWU", "2018/3/16", "人民邮电出版社"));
        bookList.addBook(new Book(5, "Code Small", "TWU", "2018/3/16", "人民邮电出版社"));
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
        List<Book> books = bookList.getBookList().stream().filter(book -> book.getId() == id).collect(Collectors.toList());
        if (books.size() > 0) {
            checkoutList.addCheckoutList(new Checkout(1, id));
            //
            return "Thank you! Enjoy the book.";
        }
        return "That book is not available.";
    }

    public static String returnBookById(int id) {
        List<Checkout> checkouts = checkoutList.getCheckoutList().stream().filter(c -> c.getBookId() == id && c.getUserId() == 1).collect(Collectors.toList());
        if (checkouts.size() > 0) {
            //
            return "Thank you for returning the book.";
        }
        return "That is not a valid book to return.";
    }

}
