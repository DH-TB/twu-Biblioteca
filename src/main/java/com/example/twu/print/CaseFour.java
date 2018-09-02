package com.example.twu.print;

import com.example.twu.controllers.BookController;

import java.util.Scanner;

import static com.example.twu.controllers.CommonController.verifyIsLogin;

public class CaseFour implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        if (!verifyIsLogin()) {
            System.out.println("please login first");
        } else {
            System.out.println("please input checkout book id");
            System.out.println(BookController.checkoutBookById(scanner.nextInt()));
        }
    }
}
