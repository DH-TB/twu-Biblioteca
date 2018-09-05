package com.example.twu;

import com.example.twu.actions.ShowBookListAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShowBookListTest {

    @Test
    void should_return_book_list_when_choose_show_book_list() {
        String result = new ShowBookListAction().getBookInfoList();

        String expected = "1 | Java | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "2 | TDD | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "3 | Refactor | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "4 | Pair Programing | TWU | 2018/3/16 | 人民邮电出版社\n" +
                "5 | Code Small | TWU | 2018/3/16 | 人民邮电出版社\n";

        assertEquals(result, expected);
    }
}
