package HomeWork_8_demo.Part3;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,30,4,5);

        int maxNumber = numbersList.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new RuntimeException("Пустой список"));

        System.out.println(maxNumber);

    }
}
