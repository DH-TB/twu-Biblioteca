package com.example.twu;

import com.example.twu.actions.LoginAction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginTest {

    private LoginAction loginAction;

    @BeforeEach
    void setup() {
        loginAction = new LoginAction();
    }

    @Test
    void should_return_login_success_when_input_right_username_and_password() {
        String actual = loginAction.checkUserAndLogin("111-1111", "pass1");
        String expect = "login success";

        assertEquals(expect, actual);
    }

    @Test
    void should_return_login_fail_when_input_error_username_and_password() {
        String actual = loginAction.checkUserAndLogin("1111", "pass1");
        String expect = "id or password is error";

        assertEquals(expect, actual);
    }
}
