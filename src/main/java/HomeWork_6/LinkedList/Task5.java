package HomeWork_6.LinkedList;

// Используйте ListIterator для прохода по LinkedList в обоих направлениях.

import java.util.LinkedList;
import java.util.ListIterator;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("В обратную сторону");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
