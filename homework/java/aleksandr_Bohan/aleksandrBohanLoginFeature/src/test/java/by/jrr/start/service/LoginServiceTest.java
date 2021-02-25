package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService loginService;

    @Before
    public void setUp(){
        this.loginService = new LoginService();
    }

    @Test
    public void checkUserPassword_positive(){
        User user = getUser();

        String userInput = "password";


       boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);

    }



    @Test
    public void checkUserPassword_negative(){
        User user = getUser();

        String userInput = "wrong";


        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);

    }

    private User getUser() {
        User user = new User();

        user.setPassword("password");
        return user;
    }



}