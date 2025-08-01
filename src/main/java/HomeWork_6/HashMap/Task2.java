package HomeWork_6.HashMap;

// Проверьте, есть ли определённое имя в HashMap.

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Дима", 18);
        people.put("Коля", 20);
        people.put("Петя", 30);
        people.put("Олег", 10);
        people.put("Гриша", 14);

       // String name = "Петя";
        String name = "Галю";

        if (people.containsKey(name)){
            System.out.println("Имя найдено!");
        } else {
            System.out.println("Имя не найдено(");
        }

    }
}
