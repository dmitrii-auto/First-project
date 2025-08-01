package HomeWork_6.LinkedHashSet;

//Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lines = new LinkedHashSet<String>();

        lines.add("1");
        lines.add("2");
        lines.add("3");
        lines.add("4");
        lines.add("5");

        System.out.println(lines);
    }
}
