package com.example.twu;

import com.example.twu.controllers.BookController;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    private DataList dataList = new DataList();
    private BookController bookController;

    @BeforeEach
    void setup() {
        bookController = new BookController();
        dataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }

    @Test
    void should_return_book_list_when_choose_show_book_list() {
        String result = bookController.getBookInfoList();

        String expected = "1 | Java | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "2 | TDD | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "3 | Refactor | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "4 | Pair Programing | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "5 | Code Small | TWU | 2018/3/16 | 人民邮电出版社\n";

        assertEquals(result, expected);
    }

    @Test
    void should_return_checkout_success_when_input_right_book_id() {
        String actual = bookController.checkoutBookById(1);
        String expected = "Thank you! Enjoy the book.";

        assertEquals(expected, actual);
    }


    @Test
    void should_return_checkout_failure_when_input_error_book_id() {
        String result = bookController.checkoutBookById(10);
        String expected = "That book is not available.";

        assertEquals(result, expected);
    }

    @Test
    void should_return_book_success_when_input_right_book_id() {
        bookController.checkoutBookById(2);
        String result = bookController.returnBookById(2);
        String expected = "Thank you for returning the book.";

        assertEquals(result, expected);
    }


    @Test
    void should_return_book_failure_when_input_error_book_id() {
        String result = bookController.returnBookById(8);
        String expected = "That is not a valid book to return.";

        assertEquals(result, expected);
    }
}