package HomeWork_8_demo.Part2;

import practice_8.library.Library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<String> listLines = Arrays.asList("привет", "всем", "как", "жизнь");
       List<String> filtered =  listLines.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filtered);

    }
}
