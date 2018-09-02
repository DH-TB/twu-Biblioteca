package com.example.twu;

import com.example.twu.controllers.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private UserController userController;

    @BeforeEach
    void setup(){
        userController = new UserController();
    }

    @Test
    void should_return_login_success_when_input_right_username_and_password() {
        String actual = userController.checkUserAndLogin("111-1111", "pass1");
        String expect = "login success";

        assertEquals(expect, actual);
    }

    @Test
    void should_return_login_fail_when_input_error_username_and_password() {
        String actual = userController.checkUserAndLogin("1111", "pass1");
        String expect = "id or password is error";

        assertEquals(expect, actual);
    }

    @Test
    void should_return_user_info_when_input_success() {
        String actual = userController.getMyUserInfo();
        String expect = "111-1111 | user1 | pass1 | 929659475@qq.com | 15091671302 | xi'an\n";

        assertEquals(expect, actual);
    }
}
