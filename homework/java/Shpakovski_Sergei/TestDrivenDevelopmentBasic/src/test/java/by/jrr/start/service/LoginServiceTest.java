package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LoginServiceTest {

    private LoginService loginService;
    private User user;
    private User blockedUser;
    private String negativeUserInput = "wrong";
    private String positiveUserInput = "password";

    @BeforeEach
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        this.blockedUser = getBlockedUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
        Assert.assertEquals(0, blockedUser.getLoginAttempts());
        Assert.assertTrue(blockedUser.isBlocked());
    }

    @Test
    public void checkUserPassword_positive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);

    }

    @Test
    public void reduceLoginAttempts() {
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void login_positive() {
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
        Assert.assertFalse(user.isBlocked());
    }

    @Test
    public void login_negative() {
        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUser() {
        user.setLoginAttempts(1);
        loginService.login(user, negativeUserInput);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_shouldBlockUser() {
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttempts());
        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void blockedUserLogin_shouldReturnFalse() {
        boolean actualResult = loginService.login(blockedUser, positiveUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void restoreAttempts() {
        user.setLoginAttempts(1);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }

    @Test
    public void after1Incorrect_shouldRestoreAttempts() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after2Incorrect_shouldRestoreAttempts() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, positiveUserInput);
        Assert.assertEquals(3, user.getLoginAttempts());
    }

    @Test
    public void after3Incorrect_shouldBlockUser() {
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        loginService.login(user, negativeUserInput);
        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
        Assert.assertFalse(actualResult);
    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

    private User getBlockedUser() {
        User user = new User();
        user.setPassword("password");
        user.setLoginAttempts(0);
        user.setBlocked(true);
        return user;
    }
}