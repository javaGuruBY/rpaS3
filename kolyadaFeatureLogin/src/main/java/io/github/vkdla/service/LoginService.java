package io.github.vkdla.service;

import io.github.vkdla.bean.User;

public class LoginService {

    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
