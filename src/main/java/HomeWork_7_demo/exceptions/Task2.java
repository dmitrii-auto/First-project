package HomeWork_7_demo.exceptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        divide();
    }

    public static void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите делимое : ");
        int divisible = scanner.nextInt();

        System.out.print("Введите делитель : ");
        int divider = scanner.nextInt();

        try {
            int resultOfDivision =  divisible / divider;
            System.out.println(divisible + " / " + divider + " = " + resultOfDivision);
        } catch (ArithmeticException e){
            System.out.print("На 0 делить нельзя");
        }
    }

}
