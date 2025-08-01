package HomeWork_6.LinkedList;
// Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

import java.awt.*;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> lines = new LinkedList<>();
        lines.add("Строка 1");
        lines.add("Строка 2");
        lines.add("Строка 3");
        lines.add("Строка 4");
        lines.add("Строка 5");

        System.out.println(lines);
    }
}
