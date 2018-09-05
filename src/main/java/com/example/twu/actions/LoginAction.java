package com.example.twu.actions;

import com.example.twu.entities.User;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class LoginAction {

    public String checkUserAndLogin(String id, String password) {
        User user = dataList.getUserList()
                .stream()
                .filter(u -> u.getId().equals(id) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        if (Objects.nonNull(user)) {
            dataList.setLoggedUser(user);

            return "login success";
        }

        return "id or password is error";
    }
}
