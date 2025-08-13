package HomeWork_8_demo.Part3;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        boolean even = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(even);
    }
}
