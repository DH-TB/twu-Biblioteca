package com.example.twu.actions;

import com.example.twu.entities.CheckoutMovie;
import com.example.twu.entities.Movie;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class CheckoutMovieAction {

    public String checkoutMovieById(int id) {
        Movie movie = dataList.getMovieList().stream().filter(b -> b.getId() == id).findFirst().orElse(null);

        if (Objects.nonNull(movie)) {
            dataList.addCheckoutMovieList(new CheckoutMovie(dataList.getLoggedUser().getId(), id));
            dataList.checkoutMovie(movie);
            return "Thank you! Enjoy the movie.";
        }
        return "That movie is not available.";
    }
}
