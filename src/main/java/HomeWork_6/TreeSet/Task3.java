package HomeWork_6.TreeSet;

// Найдите ближайшее большее и меньшее число к заданному в TreeSet.

import java.util.TreeSet;

public class Task3 {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);


        returnHigherAndLover(numbers, 4);
        System.out.println();
        returnHigherAndLover(numbers, 1);
        System.out.println();
        returnHigherAndLover(numbers, 7);

    }

    public static void returnHigherAndLover (TreeSet<Integer> numbers, int number){

        if (numbers.higher(number) != null){
            System.out.println("Ближайшее большее число : " + numbers.higher(number));
        }
        else {
            System.out.println("Больше чем " + number + " чисел нет");
        }

        if (numbers.lower(number) != null){
            System.out.println("Ближайшее меньшее число : " + numbers.lower(number));
        }
        else {
            System.out.println("Меньше чем " + number + " чисел нет");
        }

    }





}
