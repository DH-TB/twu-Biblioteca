package com.example.twu;

import com.example.twu.entities.Menu;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class twuAppApplicationTest {

    twuAppApplication biblioteca;
    Menu menu;

    @Before
    public void setUp() throws Exception {
        biblioteca = new twuAppApplication();
        menu = new Menu();
    }

    @Test
    public void should_return_welcome_info() {
        String welcomeMessage = menu.getWelcomeInfo();
        String expected = "*********** Welcome to Biblioteca! ***********";
        assertEquals(welcomeMessage, expected);
    }
    
}