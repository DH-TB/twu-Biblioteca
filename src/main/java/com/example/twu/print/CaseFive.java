package com.example.twu.print;

import com.example.twu.controllers.MovieController;

import java.util.Scanner;

public class CaseFive implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println("please input checkout movie id");
        System.out.println(MovieController.checkoutMovieById(scanner.nextInt()));
    }
}
