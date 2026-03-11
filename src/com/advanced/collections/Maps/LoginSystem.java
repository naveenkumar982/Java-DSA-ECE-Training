package com.advanced.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user1", "pass1");
        users.put("user2", "pass2");
        System.out.println(users);
        users.put("admin", "admin@1234");
        System.out.println(users);
        //How do u fetch the password of a user?
        System.out.println(users.get("admin"));
    }
}
