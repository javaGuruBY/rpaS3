package by.jrr.service;

import by.jrr.bean.User;

public class LoginService {
    public boolean login(User user, String userInput) {
        if(!user.isBlocked()){
            boolean result = checkUserPassword(user, userInput);
            updateUserStatus(user, result);
            return result;
        }
        return false;
    }

    void updateUserStatus(User user, boolean result) {
        if(result){
            restoreAttempts(user);
        } else {
            reduceLoginAttempts(user);
            blockIfLoginAttemptsExeeded(user);
        }
    }

    void blockIfLoginAttemptsExeeded(User user) {
        if(user.getLoginAttempts()==0) {
            blockUser(user);
        }
    }

    private boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }



    private void blockUser(User user) {
        user.setBlocked(true);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }
}

