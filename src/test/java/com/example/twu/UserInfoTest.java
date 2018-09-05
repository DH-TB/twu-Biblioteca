package com.example.twu;

import com.example.twu.actions.UserInfoAction;
import com.example.twu.entities.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.twu.Application.dataList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserInfoTest {

    private UserInfoAction userInfoAction;

    @BeforeEach
    void setup(){
        userInfoAction = new UserInfoAction();
        dataList.setLoggedUser(new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"));
    }


    @Test
    void should_return_user_info_when_input_success() {
        String actual = userInfoAction.getMyUserInfo();
        String expect = "111-1111 | user1 | pass1 | 929659475@qq.com | 15091671302 | xi'an\n";

        assertEquals(expect, actual);
    }
}
