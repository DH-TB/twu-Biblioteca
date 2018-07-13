package com.example.twu.entities;

public class Menu {
    public static final String MENU = "\n***********\n" +
            "1 show book list\n" +
            "2 show movie list\n" +
            "3 checkout book\n" +
            "4 return book\n" +
            "5 login\n" +
            "6 exit\n" +
            "7 my profile" +
            "***********\n";


    public static final String WELCOME_INFO = "*********** Welcome to Biblioteca! ***********";

    public void getMenu(){
        System.out.println(MENU);
    }

    public String getWelcomeInfo(){
        return WELCOME_INFO;
    }
}
