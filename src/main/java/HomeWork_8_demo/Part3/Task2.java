package HomeWork_8_demo.Part3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
        int min = numbersList.stream()
                .min(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Пустой список"));

        System.out.println(min);

    }
}
