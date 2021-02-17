package by.jrr.service;

import by.jrr.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {
    LoginService loginService;

    @Before
    public void setUp(){
        this.loginService=new LoginService();
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

        String userInput = "wrongPassword";

        boolean actualResult = loginService.checkUserPassword(user, userInput);

        Assert.assertFalse(actualResult);

    }

    private User getUser() {
        User user = new User();
        user.setPassword("password");
        return user;
    }

}