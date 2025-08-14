package HomeWork_8.Part1;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = (n) -> n % 2 == 0;

        System.out.println(checkEven.test(10));
        System.out.println(checkEven.test(1));
    }
}
