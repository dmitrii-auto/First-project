package HomeWork_7_demo.generics;

import java.util.ArrayList;

public class Task2 {

    public static <T> void myPrintArray(ArrayList<T> arrayList){
        arrayList.forEach(
                System.out::println
        );
    }
}
