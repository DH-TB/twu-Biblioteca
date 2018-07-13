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
                "4 exit\n" +
                "***********\n"+
                "please choose number you want：\n";
        assertEquals(result, expected);
    }

    @Test
    public void should_return_book_list_when_input_1() {
        BookController.saveBookList();
        String result = BookController.getBookInfoList();
        String expected = "1 | Java | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "2 | TDD | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "3 | Refactor | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "4 | Pair Programing | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "5 | Code Small | TWU | 2018/3/16 | 人民邮电出版社\n";
        assertEquals(result, expected);
    }


}