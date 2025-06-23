package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {

    public static void main(String[] args) {

        // провекра метода по распечатке чисел от 1 до 10
        //printAllNumbersBefore10();

        // проверка работы считывателя из консоли
        //commandReader();

        // проверка метода по подсчёту суммы цифр числа
        System.out.println(summOfDidgits(10000000));



    }

    public static void printAllNumbersBefore10(){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader(){
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")){
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }

    public static int summOfDidgits(int number){
        int sum = 0;

        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

}
