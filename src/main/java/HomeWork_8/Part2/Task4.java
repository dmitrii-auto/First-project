package HomeWork_8.Part2;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> squares = numbers.stream()
                .map(number -> number * number)
                .toList();

        System.out.println(squares);
    }
}
