package HomeWork_4;

import java.util.Scanner;

public class SwitchSolver {
    public static void main(String[] args) {
        // 1. Вывод дня недели по номеру
        // dayOfWeek();

        // 2. Стоимость билета по дню недели
        //priceOfTicket();

        // 3. Перевод числовых оценок в буквенные (A–F)
       // markInLetter();

        // 4. Обработка текстовых команд
        //processСommand();

        // 5. Простой калькулятор с использованием switch
        culculate();

    }

    public static void dayOfWeek(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println(day + " — \"Понедельник\"");
                break;
            case 2:
                System.out.println(day + " — \"Вторник\"");
                break;
            case 3:
                System.out.println(day + " — \"Среда\"");
                break;
            case 4:
                System.out.println(day + " — \"Четверг\"");
                break;
            case 5:
                System.out.println(day + " — \"Пятница\"");
                break;
            case 6:
                System.out.println(day + " — \"Cуббота\"");
                break;
            case 7:
                System.out.println(day + " — \"Воскресенье\"");
                break;
            default:
                System.out.println("Введён некорректный номер дня недели");
        }
    }

    public static void priceOfTicket(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели для расчёта стоимости билета: ");
        int day = scanner.nextInt();

        switch (day){
            case 1, 2, 3, 4, 5 ->  System.out.println("300 рублей");
            case 6, 7 ->  System.out.println("450 рублей");
            default ->  System.out.println("Введён некорректный номер дня недели");
        }
    }

    public static void markInLetter(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество ваших баллов: ");
        int scores = scanner.nextInt();

        if (scores >= 0 && scores <= 100){
            switch (scores / 10){
                case 10 ->  System.out.println("А");
                case 9 -> System.out.println("А");
                case 8 -> System.out.println("B");
                case 7 -> System.out.println("C");
                case 6 -> System.out.println("D");
                default -> System.out.println("F");
            }
        } else {
            System.out.println("Введёна некорректная оценка");
        }
    }

    public static void processСommand(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command){
            case "start" -> System.out.print("Система запущена");
            case "stop" -> System.out.print("Система остановлена");
            case "restart" -> System.out.print("Система перезапущена");
            case "status" -> System.out.print("Статус системы");
            default -> System.out.print("Введена несуществующая команда");
        }
    }

    public static void culculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String symbol = scanner.next();

        switch (symbol){
            case "+" -> System.out.println("Результат сложения = " + (number1 + number2));
            case "-" -> System.out.println("Результат вычитания = " + (number1 - number2));
            case "*" -> System.out.println("Результат умножения = " + (number1 * number2));
            case "/" -> {
                if (number2 == 0){
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println("Результат деления = " + (number1 / number2));
                }
            }
        }

    }




}
