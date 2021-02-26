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
        if (user.getLoginAttempts() == 1) {
            blockUser(user);
        }
        reduceLoginAttempts(user);
        return checkUserPassword(user, userInput);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }
}
