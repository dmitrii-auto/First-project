package HomeWork_6.ArrayDeque;
// Создайте ArrayDeque, добавьте 5 элементов и выведите их.


import java.util.ArrayDeque;

public class Task1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.forEach(
                System.out::println
        );
    }
}
