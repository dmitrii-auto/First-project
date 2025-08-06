package HomeWork_7.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task2 {

    public static <T> void printArray(ArrayList<T> arrayList){
        arrayList.forEach(
                System.out::println
        );

    }

}
