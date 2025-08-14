package HomeWork_8.Part2;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("привет", "мир", "как", "жизнь");

        List<Integer> filtered = lines.stream()
                .map(String::length)
                .toList();
        System.out.println(filtered);

    }
}
