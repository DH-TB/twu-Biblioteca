package com.example.twu;

import com.example.twu.controllers.MovieController;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {
    @BeforeEach
    void setup() {
        DataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }

    @Test
    void should_return_movie_list_when_choose_show_movie_list() {
        String result = MovieController.getMovieInfoList();
        String expected = "1 | movie1 | 2018/3/16 | huanglizhen | 10\n" +
                "2 | movie2 | 2018/3/16 | huanglizhen | 10\n" +
                "3 | movie3 | 2018/3/16 | huanglizhen | 10\n" +
                "4 | movie4 | 2018/3/16 | huanglizhen | 10\n" +
                "5 | movie5 | 2018/3/16 | huanglizhen | 10\n";

        assertEquals(result, expected);
    }

    @Test
    void should_return_checkout_success_when_input_right_movie_id() {
        MovieController.saveMovieList();
        String result = MovieController.checkoutMovieById(1);
        String expected = "Thank you! Enjoy the movie.";

        assertEquals(result, expected);
    }


    @Test
    void should_return_checkout_failure_when_input_error_movie_id() {
        String result = MovieController.checkoutMovieById(10);
        String expected = "That movie is not available.";

        assertEquals(result, expected);
    }

}