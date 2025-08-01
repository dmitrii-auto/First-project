package HomeWork_6.LinkedHashMap;

// Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> contacts = new LinkedHashMap<>();

        contacts.put("Петя", 1);
        contacts.put("Коля", 2);
        contacts.put("Вася", 3);

        System.out.println(contacts);

        // вариант 2
        contacts.forEach(
                (contact,number)  ->{
                    System.out.println(contact + " "+ number);
                }
        );

    }
}
