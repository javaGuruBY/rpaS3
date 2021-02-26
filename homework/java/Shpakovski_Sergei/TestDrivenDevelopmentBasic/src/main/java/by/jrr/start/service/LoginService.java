package by.jrr.start.service;

import by.jrr.start.bean.User;

public class LoginService {

    public boolean login(User user, String userInput) {
        if (!user.isBlocked()) {
            boolean passwordCorrect = checkUserPassword(user, userInput);
            updateUserStatus(user, passwordCorrect);
            return passwordCorrect;
        }
        return false;
    }

    private void updateUserStatus(User user, boolean passwordCorrect) {
        if (!passwordCorrect) {
            reduceLoginAttempts(user);
            blockIfLoginAttemptsExceded(user);
        } else {
            restoreAttempts(user);
        }
    }

    private void blockIfLoginAttemptsExceded(User user) {
        if (user.getLoginAttempts() == 0) {
            blockUser(user);
        }
    }

    private static boolean checkUserPassword(User user, String userInput) {
        return user.getPassword().equals(userInput);
    }

    private void restoreAttempts(User user) {
        user.setLoginAttempts(3);
    }

    private void reduceLoginAttempts(User user) {
        user.setLoginAttempts(user.getLoginAttempts() - 1);
    }

    private void blockUser(User user) {
        user.setBlocked(true);
    }
}
