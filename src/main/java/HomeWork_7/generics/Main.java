package HomeWork_7.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static HomeWork_7.generics.Task2.printArray;

public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task1");
        Box<String> boxString = new Box<>();
        boxString.setItem("Строка!!!");
        System.out.println(boxString.getItem());

        Box<Integer> boxInt = new Box<>();
        boxInt.setItem(1);
        System.out.println(boxInt.getItem());


        //Task2
        System.out.println("");
        System.out.println("Task2");
        ArrayList<Integer> arrayInt = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        printArray(arrayInt);
        System.out.println("");

        ArrayList<String> arrayString = new ArrayList<>(List.of("1,2,3,4,5"));
        printArray(arrayString);

        //Task3
        System.out.println("");
        System.out.println("Task3");

        Pair <Integer, String> pair = new Pair<>();
        pair.setElement1(1);
        pair.setElement2("один");

        System.out.println(pair.getElement1());
        System.out.println(pair.getElement2());



    }
}
