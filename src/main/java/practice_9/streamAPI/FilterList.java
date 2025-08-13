package practice_9.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        // 1. Создать список чётных чисел
        // далее отфильтровать все чётные числа и суммировать их
        // Промежуточная операция: фильтрация по чётности
        // Терминальная операция: суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("filter " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapYoInt: " + n);
                    return n;
                });

        System.out.println("Стрим создан, но терминальный метод ещё не вызван");

        int sum = stream.sum();

        System.out.println(numbers);
        System.out.println(sum);


    }
}
