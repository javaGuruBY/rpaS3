package by.jrr.start.service;

import by.jrr.start.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginServiceTest {

    LoginService loginService;
    User user;

    @Before
    public void setUp(){
        this.loginService = new LoginService();
        this.user = getUser();
        Assert.assertEquals(3, getUser().getLoginAttempts());
    }

    @Test
    public void checkUserPassword_positive(){

        String userInput = "password";

       boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertTrue(actualResult);

    }



    @Test
    public void checkUserPassword_negative(){

        String userInput = "wrong";


        boolean actualResult = loginService.checkUserPassword(user, userInput);
        Assert.assertFalse(actualResult);

    }

    @Test
    public void reduceLoginAttempts(){
        loginService.reduceLoginAttempts(user);
        Assert.assertEquals(2, user.getLoginAttempts());
    }

    @Test
    public void login_positive(){

        String userInput = "password";

        boolean actualResult = loginService.login(user, userInput);
        Assert.assertTrue(actualResult);
    }

    @Test
    public void login_negative(){

        String userInput = "wrong";


        boolean actualResult = loginService.login(user, userInput);
        Assert.assertFalse(actualResult);
        Assert.assertEquals(2, user.getLoginAttempts());

    }

    private User getUser() {
        User user = new User();

        user.setPassword("password");
        return user;
    }



}