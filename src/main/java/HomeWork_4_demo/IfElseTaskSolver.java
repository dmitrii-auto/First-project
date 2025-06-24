package HomeWork_4_demo;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        // проверка определения знака числа
        //determineSignNumber();

        // проверка поиска большего числа
        findMax();

    }


    // Задание 1. Определение знака числа

    public static void determineSignNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    // Задание 2. Поиск максимального из двух чисел

    public static void findMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();;

        if (number1 > number2){
            System.out.println("Большим числом является: " + number1);
        } else if (number1 < number2) {
            System.out.println("Большим числом является: " + number2);
        } else {
            System.out.println("Числа равны" );
        }
    }
}
