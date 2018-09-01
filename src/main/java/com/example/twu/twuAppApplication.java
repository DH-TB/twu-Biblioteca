package com.example.twu;

import java.util.Scanner;
import com.example.twu.controllers.BookController;
import com.example.twu.controllers.MovieController;
import com.example.twu.controllers.UserController;
import com.example.twu.entities.Menu;
import static com.example.twu.controllers.CommonController.verifyIsLogin;

public class twuAppApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuNumber;
        init();
        while ((menuNumber = scanner.nextInt()) != 8) {
            switch (menuNumber) {
                case 1:
                    System.out.println("please input user id and password( the format is:xxx-xxxx password)");
                    System.out.println(UserController.checkUser(scanner.next(),scanner.next()));
                    getMenu();
                    break;
                case 2:
                    System.out.println(BookController.getBookInfoList());
                    getMenu();
                    break;
                case 3:
                    System.out.println(MovieController.getMovieInfoList());
                    getMenu();
                    break;
                case 4:
                    if(!verifyIsLogin()){
                        System.out.println("please login first");
                    }
                    else {
                        System.out.println("please input checkout book id");
                        System.out.println(BookController.checkoutBookById(scanner.nextInt()));
                    }
                    getMenu();
                    break;
                case 5:
                    System.out.println("please input checkout movie id");
                    System.out.println(MovieController.checkoutMovieById(scanner.nextInt()));
                    getMenu();
                    break;
                case 6:
                    System.out.println("please input return book id");
                    System.out.println(BookController.returnBookById(scanner.nextInt()));
                    getMenu();
                    break;
                case 7:
                    System.out.println(UserController.getMyUserInfo());
                    getMenu();
                    break;
                default:
                    System.out.println("Select a valid option!\n");
                    getMenu();
            }
        }
    }

    private static void init() {
        BookController.saveBookList();
        MovieController.saveMovieList();
        UserController.saveUserList();

        Menu menu = new Menu();
        System.out.println(menu.getWelcomeInfo());
        getMenu();
    }


    private static void getMenu() {
        Menu menu = new Menu();
        System.out.println(menu.getMenu());
    }


}
