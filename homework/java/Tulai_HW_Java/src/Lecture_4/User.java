public class User {
    private final String login;
    private final String pass;
    private boolean inSystem = false;
    private int countOfIn = 2;
    private boolean access = true;

    public void setCountOfIn(int countOfIn) {
        this.countOfIn = countOfIn;
    }

    void BlockUser() {
        access = false;
    }

    public boolean isInSystem() {
        return inSystem;
    }

    public void setInSystem(boolean inSystem) {
        this.inSystem = inSystem;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public int getCountOfIn() {
        return countOfIn;
    }

    public boolean isAccess() {
        return access;
    }

    public User(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }
}
