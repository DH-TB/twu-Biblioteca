package com.example.twu;

import com.example.twu.entities.Menu;
import com.example.twu.print.*;
import com.example.twu.store.DataList;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static DataList dataList = new DataList();

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

        application.getWelcomeInfo();
        application.getMenu();

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

    private void getWelcomeInfo() {
        System.out.println(new Menu().getWelcomeInfo());
    }


    private void getMenu() {
        System.out.println(new Menu().getMenu());
    }
}
