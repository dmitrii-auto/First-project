package HomeWork_8.Part1;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> checkLength = (String::length);

        System.out.println(checkLength.apply("Привет"));

    }
}
