package com.example.twu.print;

import com.example.twu.actions.UserInfoAction;

import java.util.Scanner;

public class UserInfoCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println(new UserInfoAction().getMyUserInfo());
    }
}
