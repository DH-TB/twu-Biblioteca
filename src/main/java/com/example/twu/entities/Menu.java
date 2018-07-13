package com.example.twu.entities;

public class Menu {
    public static final String MENU = "\n***********\n" +
            "1 login\n" +
            "2 show all book\n" +
            "3 show all movie\n" +
            "4 checkout book\n" +
            "5 checkout movie\n" +
            "6 return book\n" +
            "7 my user info\n" +
            "8 exit\n" +
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
