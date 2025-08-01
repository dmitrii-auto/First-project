package HomeWork_6.LinkedHashSet;
// Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

import java.util.LinkedHashSet;

public class Task2 {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        addUnique(numbers,3);
        addUnique(numbers,2);
        addUnique(numbers,4);

        System.out.println(numbers);
    }

    public static void addUnique(LinkedHashSet<Integer> numbers, int number){
        if (!numbers.contains(number)){
            numbers.add(number);
        }
    }




}
