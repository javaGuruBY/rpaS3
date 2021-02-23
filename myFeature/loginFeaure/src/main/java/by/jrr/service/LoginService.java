package by.jrr.service;

import by.jrr.bean.User;

public class LoginService {
    public boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    public void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    public boolean login(User user, String userInput) {
        if(user.isBlocked()){
            return false;
        }

        if(user.getLoginAttempts()==1) {
            blockUser(user);
        }

        reduceLoginAttempts(user);
        return checkUserPassword(user, userInput);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }
}

