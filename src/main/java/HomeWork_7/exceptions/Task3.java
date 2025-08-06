package HomeWork_7.exceptions;

public class Task3 {
    public static void main(String[] args) {

        try {
            checkAge(1000);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 0 || age > 150){
            throw new InvalidAgeException("Неверный возраст");
        } else {

            System.out.println("Верный возраст!");
        }
    }
}
