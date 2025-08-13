package HomeWork_8_demo.Part1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Task1
        System.out.println("Task1");
        MathOperation add = (x,y) -> x + y;
        MathOperation subtraction = (x,y) -> x -y;
        MathOperation multiply = (x,y) -> x * y;
        MathOperation divide = (x,y) -> y != 0 ? x / y : 0;

        System.out.println(add.operation(4,9));
        System.out.println(subtraction.operation(10,9));
        System.out.println(multiply.operation(40,5));
        System.out.println(divide.operation(50,10));

        // Task2
        System.out.println("");
        System.out.println("Task2");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };

        runnable.run();

        // Task3
        System.out.println("");
        System.out.println("Task3");

        Predicate<Integer> parityСheck = n -> (n % 2) == 0;

        System.out.println(parityСheck.test(5));
        System.out.println(parityСheck.test(6));

        // Task4
        System.out.println("");
        System.out.println("Task4");

        Function<String, Integer> lengthCheck = String::length;
        System.out.println(lengthCheck.apply("Hi"));

        // Task5
        System.out.println("");
        System.out.println("Task5");

        Consumer<String> printInfo = System.out::println;
        printInfo.accept("Consumer Consumer Consumer");

    }
}
