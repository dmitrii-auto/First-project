package HomeWork_6.LinkedList;

//Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Задача 1");
        tasks.add("Задача 5");
        tasks.add("Задача 9");

        while (!tasks.isEmpty()){
            System.out.println(tasks.poll());
        }
    }
}
