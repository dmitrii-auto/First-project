package HomeWork_8.Part1;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<String> printLine = (System.out::println);

        printLine.accept("Привет");
    }
}
