package com.example.twu.print;

import com.example.twu.DataList;
import com.example.twu.controllers.MovieController;
import com.example.twu.entities.User;

import java.util.Objects;
import java.util.Scanner;

public class CaseFive implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        User user = DataList.getLoggedUser();
        if (Objects.isNull(user)) {
            System.out.println("please login first");
        }
        else {
            System.out.println("please input checkout movie id");
            System.out.println(new MovieController().checkoutMovieById(scanner.nextInt()));
        }
    }
}
