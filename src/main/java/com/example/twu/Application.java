package com.example.twu;

import com.example.twu.entities.Menu;
import com.example.twu.print.*;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Base> map = new HashMap<>();
        map.put(1, new CaseOne());
        map.put(2, new CaseTwo());
        map.put(3, new CaseThree());
        map.put(4, new CaseFour());
        map.put(5, new CaseFive());
        map.put(6, new CaseSix());
        map.put(7, new CaseSeven());


        int menu;

        application.initDataList();

        while ((menu = scanner.nextInt()) != 8) {
            Base base = map.get(menu);

            if (Objects.isNull(base)) {
                System.out.println("Select a valid option!");
            } else {
                base.print(menu, scanner);
            }
            application.getMenu();
        }
    }

    private void initDataList() {
        System.out.println(new Menu().getWelcomeInfo());
        getMenu();
    }


    private void getMenu() {
        System.out.println(new Menu().getMenu());
    }
}
