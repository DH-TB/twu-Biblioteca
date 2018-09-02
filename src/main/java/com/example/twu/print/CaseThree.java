package com.example.twu.print;

import com.example.twu.controllers.MovieController;

import java.util.Scanner;

public class CaseThree implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println(new MovieController().getMovieInfoList());
    }
}
