package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }

    public void addMovieList(List<Movie> movie) {
        this.movieList.addAll(movie);
    }

    public void checkoutMovie(Movie movie) {
        this.movieList.remove(movie);
    }
}
