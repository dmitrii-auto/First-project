package HomeWork_8_demo.Part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> linesList = Arrays.asList("q","qw", "qwe","asdfg");

        List<Integer> newLinesLIst = linesList.stream()
                .map(l -> l.length())
                .collect(Collectors.toList());

        System.out.println(newLinesLIst);

    }
}
