package HomeWork_4;

import java.util.Scanner;

public class DoWhileSolver {
    public static void main(String[] args) {
        // 1. Запрос положительного числа
        //positiveNumber();

        // 2. Проверка пароля
       // checkPassword();

        // Вывод чисел от 1 до 10 с использованием do-while
       // printBeforeTen();

       // 4. Завершение программы по команде "exit"
        //stopWhenPrintExit();

        // 5. Подсчёт количества цифр в числе
        // countNumberOfDigits();


    }

    public static void positiveNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.print("Вы ввели не отрицательное число. Конец программы");
    }

    public static void checkPassword(){
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
        }while (!input.equals(correctPassword));
        System.out.print("Вы ввели правильный пароль!");
    }

    public static void printBeforeTen(){
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <=10);
    }

    public static void stopWhenPrintExit(){
        Scanner scanner = new Scanner(System.in);

        String command;

        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }while (!command.equals("exit"));
        System.out.print("Программа остановлена");
    }

    public static void countNumberOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int summ = 0;
        int n;
        do {
            number = number / 10;
            summ++;
        } while (number > 0);

        System.out.println("Количество цифр в числе = " + summ);
    }

}
