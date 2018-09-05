package com.example.twu;

import com.example.twu.actions.CheckoutMovieAction;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.twu.Application.dataList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutMovieTest {

    private CheckoutMovieAction checkoutMovieAction;
    @BeforeEach
    void setup() {
        checkoutMovieAction = new CheckoutMovieAction();
        dataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }

    @Test
    void should_checkout_success_when_input_right_movie_id() {
        String result = checkoutMovieAction.checkoutMovieById(1);

        String expected = "Thank you! Enjoy the movie.";

        assertEquals(result, expected);
    }


    @Test
    void should_checkout_failure_when_input_error_movie_id() {
        String result = checkoutMovieAction.checkoutMovieById(10);
        String expected = "That movie is not available.";

        assertEquals(result, expected);
    }

}