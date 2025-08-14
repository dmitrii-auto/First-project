package HomeWork_8.Part2;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,10,15,50);

        List<Integer> filtered = numbers.stream()
                .filter(s -> s % 5 == 0)
                .toList();

        System.out.println(filtered);
    }
}
