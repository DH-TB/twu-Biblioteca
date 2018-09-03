package com.example.twu.controllers;

import com.example.twu.entities.CheckoutMovie;
import com.example.twu.entities.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.example.twu.Application.dataList;

public class MovieController {

    public static List<Movie> initMovie() {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, "movie1", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(2, "movie2", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(3, "movie3", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(4, "movie4", "2018/3/16", "huanglizhen", 10));
        movieList.add(new Movie(5, "movie5", "2018/3/16", "huanglizhen", 10));
        return movieList;
    }

    public String getMovieInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$d\n";
        return dataList.getMovieList().stream().map(movie -> String.format(template,
                movie.getId(),
                movie.getName(),
                movie.getYear(),
                movie.getDirector(),
                movie.getRate()
        )).collect(Collectors.joining());
    }

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
