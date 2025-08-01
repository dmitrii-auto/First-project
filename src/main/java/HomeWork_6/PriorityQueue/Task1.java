package HomeWork_6.PriorityQueue;
// Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

import java.util.PriorityQueue;

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
