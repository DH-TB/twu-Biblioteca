package com.example.twu.actions;

import com.example.twu.entities.User;

import java.util.Objects;

import static com.example.twu.Application.dataList;

public class UserInfoAction {

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
