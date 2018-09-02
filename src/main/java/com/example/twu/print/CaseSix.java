package com.example.twu.print;

import com.example.twu.controllers.BookController;

import java.util.Scanner;

public class CaseSix implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println("please input return book id");
        System.out.println(new BookController().returnBookById(scanner.nextInt()));
    }
}
