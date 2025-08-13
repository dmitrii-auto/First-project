package HomeWork_8_demo.Part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        double arithmetiсMean = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println(arithmetiсMean);
    }
}
