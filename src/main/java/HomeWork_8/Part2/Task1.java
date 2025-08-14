package HomeWork_8.Part2;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("привет", "мир", "как", "жизнь");

        List<String> filtered = lines.stream()
                .filter(string -> string.length() > 5)
                .toList();

        System.out.println(filtered);
    }
}
