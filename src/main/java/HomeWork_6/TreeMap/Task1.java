package HomeWork_6.TreeMap;

import java.util.Map;
import java.util.TreeMap;

// Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
public class Task1 {

    public static void main(String[] args) {
        TreeMap<String, Integer> rating = new TreeMap<>();

        rating.put("Петя", 1);
        rating.put("Коля", 2);
        rating.put("Вася", 3);
        rating.put("Аня", 3);
        rating.put("Язь", 3);

        rating.forEach(
                (name, number) -> {
                    System.out.println(name + " " + number);
                }
        );

    }

}
