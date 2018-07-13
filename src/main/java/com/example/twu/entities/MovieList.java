package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    private List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovieList(List<Movie> movie) {
        this.movieList.addAll(movie);
    }
}
