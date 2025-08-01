package HomeWork_6.TreeSet;

// Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);

        addUnique(numbers,7);
        addUnique(numbers,1);
        addUnique(numbers,10);

        System.out.println(numbers);
    }

    public static void addUnique(TreeSet<Integer> numbers, int number){
        if (!numbers.contains(number)){
            numbers.add(number);
        }
    }

}
