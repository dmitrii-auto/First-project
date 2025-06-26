package HomeWork_4;

import java.util.Scanner;

public class BreakContinueSolver {
    public static void main(String[] args) {
        // 1. Сумма чисел до первого отрицательного (использовать break)
       // Task1();

        // 2. Пропуск чисел, делящихся на 3 (использовать continue)
        //Task2();

        // 3. Вывод только положительных чисел (использовать continue)
        //Task3();

        // 4. Ввод строк до команды "stop" (использовать break)
        //Task4();
    }

    public static void Task1(){
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
        } while (n >= 0);
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
                System.out.println("Вы ввели 0. Конец программы");
                break;
            }

            if (n < 0){
                System.out.println("Вы ввели отрицательное число");
                continue;
            }

            System.out.println("Вы ввели положительное число: " + n);

        }
    }

    public static void Task4(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Введите текст: ");
            String text = scanner.nextLine();

            if (text.equals("stop")){
                System.out.println("Конец программы");
                break;
            }
        }
    }

}
