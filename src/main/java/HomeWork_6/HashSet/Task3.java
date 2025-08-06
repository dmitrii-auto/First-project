package HomeWork_6.HashSet;

// Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Один", "Два", "Три", "Два", "Три");

        Set<String> withoutDuplicate = removeDuplicate(lines);

        System.out.println(withoutDuplicate);

    }

    public static Set<String> removeDuplicate(List<String> list){
        return new HashSet<String>(list);
    }
}
