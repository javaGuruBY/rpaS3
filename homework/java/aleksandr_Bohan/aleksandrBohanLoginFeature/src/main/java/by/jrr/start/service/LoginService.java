package by.jrr.start.service;

import by.jrr.start.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }
}
