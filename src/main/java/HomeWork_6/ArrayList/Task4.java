package HomeWork_6.ArrayList;
// Создайте ArrayList из целых чисел.
// Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        AtomicInteger summ = new AtomicInteger();

        numbers.forEach(
                number -> {
                    summ.addAndGet(number);
                }
        );
        System.out.println(summ.get());
    }
}
