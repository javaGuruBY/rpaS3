package by.jrr.start.service;

import by.jrr.start.bean.User;

public class LoginService {
    public static boolean checkUserPassword(User user, String userImput) {
        return user.getPassword().equals(userImput);

    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);

    }
}
