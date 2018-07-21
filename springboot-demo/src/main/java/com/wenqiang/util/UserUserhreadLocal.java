package com.wenqiang.util;

import com.wenqiang.pojo.User;


public class UserUserhreadLocal {

    private static final ThreadLocal<User> LOCAL = new ThreadLocal<User>();

    private UserUserhreadLocal() {

    }

    public static void set(User user) {
        LOCAL.set(user);
    }

    public static User get() {
        return LOCAL.get();
    }

}
