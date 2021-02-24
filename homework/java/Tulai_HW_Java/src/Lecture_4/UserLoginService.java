import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserLoginService {
    public static void main(String[] args) throws IOException {
        System.out.println("Создайте нового пользователя");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Задайте Login");
        String log = reader.readLine();
        System.out.println("Задайте Password");
        String pass = reader.readLine();
        System.out.println("Вы успешно создали учётную запись");
        Authorize(log, pass);
    }

    static void Authorize(String log, String pass) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User user1 = new User(log, pass);
        while (user1.isAccess() && !user1.isInSystem()) {
            System.out.println("Введите Login:");
            String logName = reader.readLine();
            System.out.println("Введите Password:");
            String logPas = reader.readLine();
            Login(user1, logPas, logName);
        }
    }

    static void Login(User user, String password, String login) {
        if (user.getCountOfIn() > 0) {
            if (user.getPass().equals(password) && user.getLogin().equals(login)) {
                System.out.println("Вы успешно прошли аутентификацию");
                user.setCountOfIn(2);
                user.setInSystem(true);
            } else {
                user.setCountOfIn(user.getCountOfIn() - 1);
                System.out.println("Неверный логин или пароль");
            }
        } else {
            user.BlockUser();
            System.out.println("Ваш профиль заблокирован");
        }
    }
}

