package com.example.twu.controllers;

import com.example.twu.DataList;
import com.example.twu.entities.User;

import java.util.Objects;

public class CommonController {

    public static boolean verifyIsLogin() {
        User user = DataList.getLoggedUser();
        return Objects.nonNull(user);
    }
}
