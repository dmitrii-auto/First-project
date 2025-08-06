package HomeWork_7_demo.exceptions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            checkAge();
        } catch (InvalidAgeExceptions e){
            System.out.print(e.getMessage());
        }

    }

    public static void checkAge() throws InvalidAgeExceptions {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст : ");
        int age = scanner.nextInt();

        if (age < 0 || age > 150){
            throw new InvalidAgeExceptions("Неверный возраст");
        } else {
            System.out.print("Верный возраст");
        }
    }


}
