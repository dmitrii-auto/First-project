package HomeWork_8.Part1;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> checkLengt = (String::length);

        System.out.println(checkLengt.apply("Привет"));

    }
}
