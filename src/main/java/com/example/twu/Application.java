package com.example.twu;

import com.example.twu.entities.Menu;
import com.example.twu.entities.Option;
import com.example.twu.print.*;
import com.example.twu.store.DataList;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static DataList dataList = new DataList();

    public static void main(String[] args) {
        Application application = new Application();

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Base> map = new HashMap<>();

        map.put(Option.LOGIN.getValue(), new LoginCase());
        map.put(Option.SHOW_ALL_BOOK.getValue(), new ShowBookListCase());
        map.put(Option.SHOW_ALL_MOVIE.getValue(), new ShowMovieListCase());
        map.put(Option.CHECKOUT_BOOK.getValue(), new CaseFour());
        map.put(Option.CHECKOUT_MOVIE.getValue(), new CaseFive());
        map.put(Option.RETURN_BOOK.getValue(), new CaseSix());
        map.put(Option.MY_USER_INFO.getValue(), new CaseSeven());

        int menu = 0;

        application.getWelcomeInfo();
        application.getMenu();

        while (menu != 8) {
            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("please choose legal number");
            }

            Base base = map.get(menu);

            if (Objects.isNull(base)) {
                System.out.println("Select a valid option!");
            } else {
                base.print(menu, scanner);
            }

            application.getMenu();
        }
    }

    private void getWelcomeInfo() {
        System.out.println(new Menu().getWelcomeInfo());
    }


    private void getMenu() {
        System.out.println(new Menu().getMenu());
    }
}
