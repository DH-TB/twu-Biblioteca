package com.example.twu;

import com.example.twu.entities.Menu;

import java.util.Scanner;


public class twuAppApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuNumber;
        init();
        while ((menuNumber = scanner.nextInt()) != 5) {
            switch (menuNumber) {
                case 1:
                    System.out.println(BookController.getBookInfoList());
                    getMenu();
                    break;
                case 2:
                    System.out.println("please input checkout book id");
                    System.out.println(BookController.checkoutBookById(scanner.nextInt()));
                    getMenu();
                    break;
                case 3:
                    System.out.println("please input return book id");
                    System.out.println(BookController.returnBookById(scanner.nextInt()));
                    getMenu();
                    break;
                case 4:
                    System.out.println(MovieController.getMovieInfoList());
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
        BookController.saveBookList();
        MovieController.saveMovieList();
    }



    public static void getMenu() {
        Menu menu = new Menu();
        System.out.println(menu.getMenu());
    }
}
