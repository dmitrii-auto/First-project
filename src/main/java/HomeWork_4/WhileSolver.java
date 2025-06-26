package HomeWork_4;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
        // 1. Вычисление факториала с помощью while
        // calculateFactorial();

        //2. Вывод всех чётных чисел до заданного
        // printEvenNumber();

        //3. Обратный отсчёт от введённого числа до 1
       // countdown();
    }

    public static void calculateFactorial(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;

        if (n > 0){
            while (i <= n){
                result = result * i ;
                i++;
            }
            System.out.println("Факториал = " + result);
        } else {
            System.out.println("Введите число больше 0");
        }

    }
    public static void printEvenNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int i = 1;

        if (n > 0){
            if (n == 1){
                System.out.println("Чётных чисел нет");
            }
            while (i <= n){
                if (i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Введите число больше 0");
        }
    }

    public static void countdown(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        if (n > 0){
            while (n >= 1){
                System.out.println(n);
                n--;
            }
        } else {
            System.out.print("Введите положительное число");
        }

    }
}
