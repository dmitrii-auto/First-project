package HomeWork_8_demo.Part4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Авто", "Берлога", "Акакий", "Волк");

        Map<String, List<String>> groupedLines = lines.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0,1) ));

        System.out.println(groupedLines);

    }
}
