package HomeWork_6.LinkedList;
// Создайте LinkedList, содержащий несколько строк.
// Напишите программу, которая печатает первый и последний элементы списка.

import java.util.LinkedList;

public class Task3 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
    }
}
