package HomeWork_8_demo.Part3;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);

        int summ = numbersList.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(summ);
    }
}
