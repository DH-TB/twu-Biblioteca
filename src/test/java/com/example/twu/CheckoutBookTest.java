package com.example.twu;

import com.example.twu.actions.CheckoutBookAction;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.twu.Application.dataList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutBookTest {
    private CheckoutBookAction checkoutBookAction;

    @BeforeEach
    void setup(){
        checkoutBookAction = new CheckoutBookAction();
        dataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }

    @Test
    void should_checkout_success_when_input_right_book_id() {
        String actual = checkoutBookAction.checkoutBookById(1);
        String expected = "Thank you! Enjoy the book.";

        assertEquals(expected, actual);
    }


    @Test
    void should_checkout_failure_when_input_error_book_id() {
        String result = checkoutBookAction.checkoutBookById(10);
        String expected = "That book is not available.";

        assertEquals(result, expected);
    }
}
