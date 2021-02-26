package io.github.vkdla.service;

import io.github.vkdla.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LoginServiceTest {
    LoginService loginService;
    User user;
    String positiveUserInput = "admin";
    String negativeUserInput = "wrong";

    @Before
    public void setUp() {
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());
    }

    @Test
    public void checkUserPassword_positive() {
        boolean actualResult = loginService.checkUserPassword(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void checkUserPassword_negative() {


        boolean actualResult = loginService.checkUserPassword(user, negativeUserInput);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void reduceLoginAttempts() {
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void login_positive() {


        boolean actualResult = loginService.login(user, positiveUserInput);
        Assert.assertTrue(actualResult);
    }
    @Test
    public void login_negative() {


        boolean actualResult = loginService.login(user, negativeUserInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void blockUser() {
        loginService.blockUser(user);
        Assert.assertTrue(user.isBlocked());
    }

    @Test
    public void after3WrongPasswords_ShouldBlockUser() {

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(2, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(1, user.getLoginAttempts());
        Assert.assertFalse(user.isBlocked());

        loginService.login(user, negativeUserInput);
        Assert.assertEquals(0, user.getLoginAttempts());
        Assert.assertTrue(user.isBlocked());
    }

    private User getUser() {
        User user = new User();
        user.setPassword("admin");
        return user;
    }
}