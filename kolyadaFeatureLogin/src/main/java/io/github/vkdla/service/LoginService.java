package io.github.vkdla.service;

import io.github.vkdla.bean.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    public boolean login(User user, String userInput) {
        if (user.isBlocked()) {
            return false;
        }
        if (user.getLoginAttempts() == 1) {
            blockUser(user);
        }
        reduceLoginAttempts(user);
        boolean result = checkUserPassword(user, userInput);
        if(result) {
            restoreLoginAttempts(user);
        }
        return result;
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }

    public void restoreLoginAttempts(User user) {
        user.setLoginAttempts(3);
    }
}
