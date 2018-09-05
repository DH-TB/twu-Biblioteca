package com.example.twu.print;

import com.example.twu.actions.LoginAction;
import java.util.Scanner;

public class LoginCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println("please input user id and password( the format is:111-1111 pass1)");
        System.out.println(new LoginAction().checkUserAndLogin(scanner.next(), scanner.next()));
    }
}
