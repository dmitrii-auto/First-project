package HomeWork_8_demo.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1,2,3,3,2,5,6,1);

        List<Integer> uniqueElements = elements.stream()
                .distinct()
                .toList();
        System.out.println(uniqueElements);
    }
}
