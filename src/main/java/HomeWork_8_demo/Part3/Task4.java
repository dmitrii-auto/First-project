package HomeWork_8_demo.Part3;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> linesList = Arrays.asList("Коля", "Боря", "Вова", "Борис");

        String check = linesList.stream()
                .filter(n -> n.startsWith("Б"))
                        .findFirst()
                                .orElse("Нет подходящей строки");


        System.out.println(check);

    }
}
