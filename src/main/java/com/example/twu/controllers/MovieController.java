package com.example.twu.controllers;

import com.example.twu.entities.Book;
import com.example.twu.entities.Checkout;
import com.example.twu.entities.Movie;
import com.example.twu.entities.MovieList;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MovieController {
    private static MovieList movieList = new MovieList();

    public static List<Movie> initMovie() {
        return Arrays.asList(
                new Movie(1, "movie1", "2018/3/16", "huanglizhen", 10),
                new Movie(2, "movie2", "2018/3/16", "huanglizhen", 10),
                new Movie(3, "movie3", "2018/3/16", "huanglizhen", 10),
                new Movie(4, "movie4", "2018/3/16", "huanglizhen", 10),
                new Movie(5, "movie5", "2018/3/16", "huanglizhen", 10)
        );
    }

    public static void saveMovieList() {
        movieList.addMovieList(initMovie());
    }

    public static String getMovieInfoList() {
        String template = "%1$d | %2$s | %3$s | %4$s | %5$d\n";
        return movieList.getMovieList().stream().map(movie -> String.format(template,
                movie.getId(),
                movie.getName(),
                movie.getYear(),
                movie.getDirector(),
                movie.getRate()
        )).collect(Collectors.joining());
    }

    public static String checkoutMovieById(int id) {
        Movie movie = movieList.getMovieList().stream().filter(b -> b.getId() == id).findFirst().orElse(null);
        if (Objects.nonNull(movie)) {
            return "Thank you! Enjoy the movie.";
        }
        return "That movie is not available.";
    }
}
