package HomeWork_8.Part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,1);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Пустой список"));

        System.out.println(max);
    }
}
