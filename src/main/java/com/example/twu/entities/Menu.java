package com.example.twu.entities;

public class Menu {
    public static final String MENU = "\n***********\n" +
            "1 show all book\n" +
            "2 checkout book\n" +
            "3 return book\n" +
            "4 exit\n" +
            "***********\n"+
            "please choose number you want：\n";


    public static final String WELCOME_INFO = "*********** Welcome to Biblioteca! ***********";

    public String getMenu(){
        return MENU;
    }

    public String getWelcomeInfo(){
        return WELCOME_INFO;
    }
}
