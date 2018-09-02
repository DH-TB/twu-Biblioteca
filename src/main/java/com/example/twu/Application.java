package com.example.twu;

import com.example.twu.controllers.BookController;
import com.example.twu.controllers.MovieController;
import com.example.twu.controllers.UserController;
import com.example.twu.entities.Menu;
import com.example.twu.print.*;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        HashMap<Integer, Base> map = new HashMap<>();
        map.put(1, new CaseOne());
        map.put(2, new CaseTwo());
        map.put(3, new CaseThree());
        map.put(4, new CaseFour());
        map.put(5, new CaseFive());
        map.put(6, new CaseSix());
        map.put(7, new CaseSeven());

        Scanner scanner = new Scanner(System.in);

        int menu;
        initDataList();

        while ((menu = scanner.nextInt()) != 8) {
            Base base = map.get(menu);

            if (Objects.isNull(base)) {
                System.out.println("Select a valid option!");
            } else {
                base.print(menu, scanner);
            }
            getMenu();
        }
    }

    private static void initDataList() {
        BookController.saveBookList();
        MovieController.saveMovieList();
        UserController.saveUserList();

        System.out.println(new Menu().getWelcomeInfo());
        Application.getMenu();
    }


    private static void getMenu() {
        System.out.println(new Menu().getMenu());
    }
}
