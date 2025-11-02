package HomeWork_13_complex.complex_task2;

import java.util.regex.Pattern;

public class UserValidator {

    private boolean validationEnabled = true;

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    private void validateName(User user){
        if(user.getName().isEmpty() || user.getName() == null){
                throw new InvalidUserException("Имя не должно быть пустым");
        }
        if (!Character.isUpperCase(user.getName().charAt(0))){
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }
    }

    private void validateAge(User user){
        if (user.getAge() <= 18 || user.getAge() >= 100){
            throw new InvalidUserException("Некорректный возраст. Возраст должен быть в пределах от 18 до 100 лет.");
        }
    }

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"
    );

    private void validateEmail(User user){
        if (!EMAIL_PATTERN.matcher(user.getEmail()).matches() || user.getEmail() == null){
            throw new InvalidUserException("Некорректный email.");

        }
    }

    public void validateUser(User user){
        if (!validationEnabled) return;

        validateName(user);
        validateAge(user);
        validateEmail(user);
    }

}
