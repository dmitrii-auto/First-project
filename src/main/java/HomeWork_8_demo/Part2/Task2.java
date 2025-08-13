package HomeWork_8_demo.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(500,1,2,3,4,5,10,100,15);

        List<Integer> filtered = numbersList.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
