package com.example.twu;

import com.example.twu.entities.User;
import com.example.twu.entities.UserList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UserController {

    private static UserList userList = new UserList();
    public static List<User> initUser() {
        return Arrays.asList(
                new User("111-1111", "user1", "pass1", "929659475@qq.com", "15091671302","xi'an"),
                new User("222-2222", "user2", "pass2", "929659475@qq.com", "15091671302","xi'an"),
                new User("333-3333", "user3", "pass3", "929659475@qq.com", "15091671302","xi'an"),
                new User("444-4444", "user4", "pass4", "929659475@qq.com", "15091671302","xi'an"),
                new User("555-5555", "user5", "pass5", "929659475@qq.com", "15091671302","xi'an")
        );
    }

    public static void saveUserList() {
        userList.addUserList(initUser());
    }

    public static String checkUser(String id,String password){
        User user= userList.getUserList().stream().filter(u->u.getId() == id &&u.getPassword() == password).findFirst().orElse(null);
        if(Objects.nonNull(user)){
            new UserList().setLoggedUser(user);
            return "login success";
        }
        return "id or password is error";
    }

}
