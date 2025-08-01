package HomeWork_6.LinkedList;

//Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        AtomicInteger summ = new AtomicInteger();

        numbers.forEach(
                number ->{
                    summ.addAndGet(number);
                }
        );
        System.out.println(summ.get());
    }
}
