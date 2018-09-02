package com.example.twu.print;

import com.example.twu.DataList;
import com.example.twu.controllers.BookController;
import com.example.twu.entities.User;

import java.util.Objects;
import java.util.Scanner;

public class CaseFour implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        User user = DataList.getLoggedUser();
        if (Objects.isNull(user)) {
            System.out.println("please login first");

        } else {
            System.out.println("please input checkout book id");
            System.out.println(new BookController().checkoutBookById(scanner.nextInt()));
        }
    }
}