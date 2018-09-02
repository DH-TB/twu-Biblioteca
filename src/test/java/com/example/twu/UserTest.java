package com.example.twu;

import com.example.twu.controllers.UserController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void should_return_login_success_when_input_right_username_and_password() {
        UserController.saveUserList();
        String actual = UserController.checkUserAndLogin("111-1111", "pass1");
        String expect = "login success";

        assertEquals(expect, actual);
    }

    @Test
    void should_return_login_fail_when_input_error_username_and_password() {
        String actual = UserController.checkUserAndLogin("1111", "pass1");
        String expect = "id or password is error";

        assertEquals(expect, actual);
    }

    @Test
    void should_return_user_info_when_input_success() {
        String actual = UserController.getMyUserInfo();
        String expect = "111-1111 | user1 | pass1 | 929659475@qq.com | 15091671302 | xi'an\n";

        assertEquals(expect, actual);
    }
}
