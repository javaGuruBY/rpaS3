# User
1. Login
1. Password
1. LoginAttempt
1. Blocked

## Операция проверки доступа в учетную запись
Сверяет данные полученные из БД с _*введенными пользователем*_
Возвращает true, если пользователю разрешен доступ, и false, если нет

- [x] Проверка заключается в сверке _*пароля для*_ запрашиваемого _*логина*_ с пришедшими из БД
- [x] У пользователя три _*попытки*_ ввода пароля
- [x] Если пароль введен неправильно, количество попыток уменьшается на 1
- [x] Если количество попыток закончилось, значит пользователь должен быть _*заблокирован*_
- [x] Если пользователь заблокирован, он не может войти в учетную запись
- [x] Если пароль введен правильно, то количество попыток должно быть восстановлено
