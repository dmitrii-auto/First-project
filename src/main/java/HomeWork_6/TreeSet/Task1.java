package HomeWork_6.TreeSet;

import java.util.TreeSet;

// Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
public class Task1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(6);


        System.out.println(treeSet);
    }
}
