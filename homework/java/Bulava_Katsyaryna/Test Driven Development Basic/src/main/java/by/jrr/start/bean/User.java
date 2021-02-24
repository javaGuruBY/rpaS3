package by.jrr.start.bean;

import java.util.Objects;
//POJO

public class User {
        private String Login;
        private String Password;
        private int LoginAttempts = 3;
        private boolean Blocked;

    public User() {
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getLoginAttempts() {
        return LoginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        LoginAttempts = loginAttempts;
    }

    public boolean isBlocked() {
        return Blocked;
    }

    public void setBlocked(boolean blocked) {
        Blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return LoginAttempts == user.LoginAttempts && Blocked == user.Blocked && Objects.equals(Login, user.Login) && Objects.equals(Password, user.Password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Login, Password, LoginAttempts, Blocked);
    }

    @Override
    public String toString() {
        return "User{" +
                "Login='" + Login + '\'' +
                ", Password='" + Password + '\'' +
                ", LoginAttempts=" + LoginAttempts +
                ", Blocked=" + Blocked +
                '}';
    }
}
