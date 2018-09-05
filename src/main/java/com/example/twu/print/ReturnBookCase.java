package com.example.twu.print;

import com.example.twu.actions.ReturnBookAction;

import java.util.Scanner;

public class ReturnBookCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println("please input return book id");
        System.out.println(new ReturnBookAction().returnBookById(scanner.nextInt()));
    }
}
