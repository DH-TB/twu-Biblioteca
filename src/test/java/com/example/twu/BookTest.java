package com.example.twu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void should_return_book_list_when_choose_show_book_list() {
        BookController.saveBookList();
        String result = BookController.getBookInfoList();
        String expected = "1 | Java | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "2 | TDD | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "3 | Refactor | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "4 | Pair Programing | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "5 | Code Small | TWU | 2018/3/16 | 人民邮电出版社\n";
        assertEquals(result, expected);
    }

    @Test
    public void should_return_checkout_success_when_input_right_book_id() {
        String result = BookController.checkoutBookById(1);
        String expected = "Thank you! Enjoy the book.";
        assertEquals(result, expected);
    }


    @Test
    public void should_return_checkout_failure_when_input_error_book_id() {
        String result = BookController.checkoutBookById(10);
        String expected = "That book is not available.";
        assertEquals(result, expected);
    }

    @Test
    public void should_return_book_success_when_input_right_book_id() {
        BookController.checkoutBookById(2);
        String result = BookController.returnBookById(2);
        String expected = "Thank you for returning the book.";
        assertEquals(result, expected);
    }


    @Test
    public void should_return_bookt_failure_when_input_error_book_id() {
        String result = BookController.returnBookById(8);
        String expected = "That is not a valid book to return.";
        assertEquals(result, expected);
    }
}