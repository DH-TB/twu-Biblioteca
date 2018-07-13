package com.example.twu.entities;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private List<User> userList = new ArrayList<>();
    private User loggedUser;

    public List<User> getUserList() {
        return userList;
    }

    public void addUserList(List<User> user) {
        this.userList.addAll(user);
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }
}
