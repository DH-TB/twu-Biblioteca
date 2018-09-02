package com.example.twu.print;

import com.example.twu.controllers.UserController;

import java.util.Scanner;

public class CaseSeven implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println(new UserController().getMyUserInfo());
    }
}
