package HomeWork_7_demo.generics;


import java.util.ArrayList;
import java.util.Arrays;

import static HomeWork_7_demo.generics.Task2.myPrintArray;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        Task1<Integer> number = new Task1<>();
        number.setElements(123);
        System.out.println(number.getElements());


        Task1<String> line = new Task1<>();
        line.setElements("строка");
        System.out.println(line.getElements());

        //Task2
        System.out.println(" ");
        System.out.println("Task2");
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4));
        myPrintArray(intArray);

        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("один", "два", "три"));
        myPrintArray(strArray);

        //Task3
        System.out.println(" ");
        System.out.println("Task3");

        Pair<String, Integer> pair = new Pair<>();

        pair.setItem1("Строка");
        System.out.println(pair.getItem1());

        pair.setItem2(1);
        System.out.println(pair.getItem2());
    }
}
