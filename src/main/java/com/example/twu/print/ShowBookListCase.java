package com.example.twu.print;

import com.example.twu.controllers.BookController;

import java.util.Scanner;

public class ShowBookListCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println(new BookController().getBookInfoList());
    }
}
