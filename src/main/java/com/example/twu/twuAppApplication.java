package com.example.twu;

import com.example.twu.entities.Book;
import com.example.twu.entities.BookList;
import com.example.twu.entities.Data;
import com.example.twu.entities.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class twuAppApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuNumber;
        init();
        while ((menuNumber = scanner.nextInt()) != 4) {
            switch (menuNumber) {
                case 1:
                    System.out.println(Data.getBookInfoList());
                    getMenu();
                    break;
                case 2:
                    System.out.println("please input checkout book id");
                    System.out.println(Data.checkoutBookById(scanner.nextInt()));
                    getMenu();
                    break;
                case 3:
                    System.out.println("please input return book id");
                    System.out.println(Data.returnBookById(scanner.nextInt()));
                    getMenu();
                    break;
                default:
                    System.out.println("Select a valid option!\n");
                    getMenu();
            }
        }
    }

    public static void init() {
        Menu menu = new Menu();
        System.out.println(menu.getWelcomeInfo());
        getMenu();
        Data.saveBookList();
    }



    public static void getMenu() {
        Menu menu = new Menu();
        System.out.println(menu.getMenu());
    }
}
