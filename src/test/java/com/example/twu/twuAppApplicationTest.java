package com.example.twu;

import com.example.twu.entities.Menu;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class twuAppApplicationTest {
    Menu menu;

    @Before
    public void setUp() throws Exception {
        menu = new Menu();
    }

    @Test
    public void should_return_welcome_info() {
        String result = menu.getWelcomeInfo();
        String expected = "*********** Welcome to Biblioteca! ***********";
        assertEquals(result, expected);
    }

    @Test
    public void should_return_menu() {
        String result = menu.getMenu();
        String expected = "\n***********\n" +
                "1 show all book\n" +
                "2 checkout book\n" +
                "3 return book\n" +
                "4 show all movie\n" +
                "5 checkout movie\n" +
                "6 exit\n" +
                "***********\n" +
                "please choose number you want：\n";
        assertEquals(result, expected);
    }
}