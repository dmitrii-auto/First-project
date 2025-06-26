package HomeWork_4;

import java.util.Scanner;

public class ForSolver {

    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 100, делящихся на 3
       // printNumberDividedThree();

        // 2. Сумма чисел от 1 до n
        // summOfNumber();

        // 3. Таблица умножения для числа
       // multiplicationTable();

        // 4. Проверка на простое число
       // checkSimpleNumber();

        // 5. Вывод чисел от 1 до 10
       // printBeforeTen();
    }

    public static void printNumberDividedThree(){

        for (int i = 1; i <=100; i++ ){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void summOfNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int summ = 0;

        // по условию задачи не совсем понимаю само n должно входить  в сумму или нет.
        // буду считать что n тоже надо включать в сумму поэтому использую в цикле условие i <= n
        for (int i = 1; i <= n; i++){
            summ = summ + i;
        }
        System.out.println("Cумма чисел = " + summ);
    }

    public static void multiplicationTable(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void checkSimpleNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;


        for (int i = 2; i < number; i++){
                if (number % i == 0){
                    isPrime = false;
                    break;
                }
        }
        if (isPrime){
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }

    public static void printBeforeTen(){
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
    }

}
