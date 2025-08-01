package HomeWork_6.ArrayList;

// Создайте ArrayList из целых чисел.
// Напишите программу, которая находит и выводит максимальное число из списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        AtomicInteger maxNumber = new AtomicInteger(numbers.get(0));
//
//        numbers.forEach(
//                number -> {
//                    if (number > maxNumber.get()){
//                        maxNumber.set(number);
//                    }
//                }
//        );
//
//        System.out.println(maxNumber.get());

        int maxNumber = Collections.max(numbers);

        System.out.println(maxNumber);

    }




}
