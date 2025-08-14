package HomeWork_8.Part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,5,5,5,5);

        double arithmeticMean = numbers.stream()
                .collect(Collectors.averagingInt(number -> number));

        System.out.println(arithmeticMean);
    }
}
