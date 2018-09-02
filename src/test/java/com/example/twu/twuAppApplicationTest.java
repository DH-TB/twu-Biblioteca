package com.example.twu;

import com.example.twu.entities.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class twuAppApplicationTest {
    private Menu menu;

    @BeforeEach
    void setUp() {
        menu = new Menu();
    }

    @Test
    void should_return_welcome_info() {
        String result = menu.getWelcomeInfo();
        String expected = "*********** Welcome to Biblioteca! ***********";
        assertEquals(result, expected);
    }

    @Test
    void should_return_menu() {
        String result = menu.getMenu();
        String expected = "\n***********\n" +
                "1 login\n" +
                "2 show all book\n" +
                "3 show all movie\n" +
                "4 checkout book\n" +
                "5 checkout movie\n" +
                "6 return book\n" +
                "7 my user info\n" +
                "8 exit\n" +
                "***********\n" +
                "please choose number you want：\n";
        assertEquals(result, expected);
    }
}