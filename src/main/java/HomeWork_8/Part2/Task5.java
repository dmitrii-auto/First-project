package HomeWork_8.Part2;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,5,1,2,8,9);

        List<Integer> unique = numbers.stream()
                .distinct()
                .toList();

        System.out.println(unique);

    }
}
