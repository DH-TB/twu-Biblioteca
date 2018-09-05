package com.example.twu;

import com.example.twu.actions.CheckoutBookAction;
import com.example.twu.actions.ReturnBookAction;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.twu.Application.dataList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReturnBookTest {

    private ReturnBookAction returnBookAction;

    @BeforeEach
    void setup() {
        returnBookAction = new ReturnBookAction();
        dataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }

    @Test
    void should_return_book_success_when_input_right_book_id() {
        CheckoutBookAction checkoutBookAction = new CheckoutBookAction();
        checkoutBookAction.checkoutBookById(2);

        String result = returnBookAction.returnBookById(2);
        String expected = "Thank you for returning the book.";

        assertEquals(result, expected);
    }


    @Test
    void should_return_book_failure_when_input_error_book_id() {
        String result = returnBookAction.returnBookById(8);
        String expected = "That is not a valid book to return.";

        assertEquals(result, expected);
    }
}