package com.example.twu.print;

import com.example.twu.Application;
import com.example.twu.controllers.MovieController;
import com.example.twu.entities.User;

import java.util.Objects;
import java.util.Scanner;

public class CheckoutMovieCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        User user = Application.dataList.getLoggedUser();
        if (Objects.isNull(user)) {
            System.out.println("please login first");
        } else {
            System.out.println("please input checkout movie id");
            System.out.println(new MovieController().checkoutMovieById(scanner.nextInt()));
        }
    }
}
