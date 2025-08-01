package HomeWork_6.HashSet;
// Создайте HashSet из 5 чисел и выведите его содержимое.

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

    }
}
