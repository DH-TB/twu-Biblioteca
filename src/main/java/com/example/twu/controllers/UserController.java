package com.example.twu.controllers;

import com.example.twu.DataList;
import com.example.twu.entities.User;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static com.example.twu.controllers.CommonController.verifyIsLogin;

public class UserController {

    private static List<User> initUser() {
        return Arrays.asList(
                new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302", "xi'an"),
                new User("222-2222", "user2", "pass2", "929659475@qq.com", "15091671302", "xi'an"),
                new User("333-3333", "user3", "pass3", "929659475@qq.com", "15091671302", "xi'an"),
                new User("444-4444", "user4", "pass4", "929659475@qq.com", "15091671302", "xi'an"),
                new User("555-5555", "user5", "pass5", "929659475@qq.com", "15091671302", "xi'an")
        );
    }

    public static void saveUserList() {
        DataList.addUserList(initUser());
    }

    public static String checkUserAndLogin(String id, String password) {
        User user = DataList.getUserList()
                .stream()
                .filter(u -> u.getId().equals(id) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
        if (Objects.nonNull(user)) {
            DataList.setLoggedUser(user);

            return "login success";
        }

        return "id or password is error";
    }

    public static String getMyUserInfo() {
        if(!verifyIsLogin()){
            return "please login first";
        }

        String template = "%1$s | %2$s | %3$s | %4$s | %5$s | %6$s\n";
        User user = DataList.getLoggedUser();

        return String.format(template,
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress());
    }
}