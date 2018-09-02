package com.example.twu.print;

import com.example.twu.controllers.MovieController;

import java.util.Scanner;

import static com.example.twu.controllers.CommonController.verifyIsLogin;

public class CaseFive implements Base {

    @Override
    public void print(int input, Scanner scanner) {

        if (!verifyIsLogin()) {
            System.out.println("please login first");
        } else {
            System.out.println("please input checkout movie id");
            System.out.println(MovieController.checkoutMovieById(scanner.nextInt()));
        }
    }
}
