package com.example.twu.controllers;

import com.example.twu.Application;
import com.example.twu.store.DataList;
import com.example.twu.entities.User;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class UserController {

    private Application app = new Application();

    public String checkUserAndLogin(String id, String password) {
        User user = dataList.getUserList()
                .stream()
                .filter(u -> u.getId().equals(id) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
        if (Objects.nonNull(user)) {
            new DataList().setLoggedUser(user);
            dataList.setLoggedUser(user);

            return "login success";
        }

        return "id or password is error";
    }

    public String getMyUserInfo() {
        User user = dataList.getLoggedUser();
        if (Objects.isNull(user)) {
            return "please login first";
        }

        String template = "%1$s | %2$s | %3$s | %4$s | %5$s | %6$s\n";

        return String.format(template,
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress());
    }
}
