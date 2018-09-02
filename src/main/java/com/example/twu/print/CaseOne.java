package com.example.twu.print;

import com.example.twu.controllers.UserController;

import java.util.Scanner;

public class CaseOne implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println("please input user id and password( the format is:xxx-xxxx password)");
        System.out.println(UserController.checkUserAndLogin(scanner.next(), scanner.next()));
    }
}
