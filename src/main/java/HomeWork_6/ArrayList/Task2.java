package HomeWork_6.ArrayList;
// Напишите программу, которая выводит все чётные числа из ArrayList.

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        numbers.forEach(
                number -> {
                    if (number % 2 == 0){
                        System.out.println(number);
                    }
                }
        );

    }
}
