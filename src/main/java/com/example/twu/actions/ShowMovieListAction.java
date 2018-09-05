package com.example.twu.actions;

import java.util.stream.Collectors;

import static com.example.twu.Application.dataList;

public class ShowMovieListAction {
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

}
