package HomeWork_6.HashSet;
// Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers.contains(10));
        System.out.println(numbers.contains(11));
    }

}
