package HomeWork_8.Part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("привет", "мир", "как", "жизнь", "мнение", "конь");

        Map<String, List<String>> grouped = lines.stream()
                .collect(Collectors.groupingBy(l -> l.substring(0,1)));

        System.out.println(grouped);

    }
}
