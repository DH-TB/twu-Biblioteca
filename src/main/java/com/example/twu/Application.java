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

        HashMap<Integer, Base> map = application.getInputCase();

        int menu = 0;

        application.getWelcomeInfo();
        application.getMenu();

        try {
            while ((menu = scanner.nextInt()) != Option.EXIT.getValue()) {

                notHaveChoice(application, scanner, map, menu);
            }
        } catch (InputMismatchException ex) {
            System.out.println("-----------not legal-----------");
        }
    }


    private static void notHaveChoice(Application application, Scanner scanner, HashMap<Integer, Base> map, int menu) {
        Base base = map.get(menu);

        if (Objects.isNull(base)) {
            System.out.println("Select a valid option!");
        } else {
            base.print(menu, scanner);
        }

        application.getMenu();
    }

    private HashMap<Integer, Base> getInputCase() {
        HashMap<Integer, Base> map = new HashMap<>();

        map.put(Option.LOGIN.getValue(), new LoginCase());
        map.put(Option.SHOW_ALL_BOOK.getValue(), new ShowBookListCase());
        map.put(Option.SHOW_ALL_MOVIE.getValue(), new ShowMovieListCase());
        map.put(Option.CHECKOUT_BOOK.getValue(), new CheckoutBookCase());
        map.put(Option.CHECKOUT_MOVIE.getValue(), new CheckoutMovieCase());
        map.put(Option.RETURN_BOOK.getValue(), new ReturnBookCase());
        map.put(Option.MY_USER_INFO.getValue(), new UserInfoCase());

        return map;
    }

    private void getWelcomeInfo() {
        System.out.println(new Menu().getWelcomeInfo());
    }


    private void getMenu() {
        System.out.println(new Menu().getMenu());
    }
}
