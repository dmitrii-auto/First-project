package HomeWork_4_demo;

import java.util.Scanner;

public class BreakContinueSolver {

    public static void main(String[] args) {

        //summOfNumbers();

        //Task2();

        //Task3();

        Task4();



    }

    public static void summOfNumbers(){
        Scanner scanner = new Scanner(System.in);

        int summ = 0;
        int n;
        do {
            System.out.print("Введите число: ");
            n = scanner.nextInt();
            if (n < 0){
                break;
            }
            summ = summ + n;
        }while (n >= 0);
        System.out.println("Сумма введённых чисел = " + summ);

    }

    public static void Task2(){
        for (int i = 1; i <=20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void Task3(){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Введите число: ");
            int n = scanner.nextInt();

            if (n == 0){
                System.out.print("Вы ввели 0. Конец программы");
                break;
            }

            if (n < 0){
                System.out.println("Отрицательные числа не распечатываем");
                continue;
            }

            System.out.println("Вы ввели положительное число: " + n);
        }
    }

    public static void Task4(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();

            if (text.equals("stop")){
                break;
            }
        }

    }

}
