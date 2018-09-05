package com.example.twu;

import com.example.twu.actions.ShowMovieListAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShowMovieListTest {
    @Test
    void should_return_movie_list_when_choose_show_movie_list() {
        String result = new ShowMovieListAction().getMovieInfoList();

        String expected = "1 | movie1 | 2018/3/16 | huanglizhen | 10\n" +
                        "2 | movie2 | 2018/3/16 | huanglizhen | 10\n" +
                        "3 | movie3 | 2018/3/16 | huanglizhen | 10\n" +
                        "4 | movie4 | 2018/3/16 | huanglizhen | 10\n" +
                        "5 | movie5 | 2018/3/16 | huanglizhen | 10\n";

        assertEquals(result, expected);
    }
}
