package HomeWork_6.LinkedHashMap;

// Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

import java.util.LinkedHashMap;

public class Task2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> contacts = new LinkedHashMap<>();

        // добавил контакты
        contacts.put("Петя", 111);
        contacts.put("Коля", 222);
        contacts.put("Вася", 333);

       // String nameForFind = "Петя";
        String nameForFind = "Иван";

        // нашёл контакт
        if (contacts.containsKey(nameForFind)){
            System.out.println("Контакт найден");
        }
        else {
            System.out.println("Контакт не найден");
        }
    }


}
