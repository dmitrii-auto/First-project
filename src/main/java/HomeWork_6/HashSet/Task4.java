package HomeWork_6.HashSet;
// Создайте HashSet, содержащий набор имен.
// Напишите программу, которая проверяет, содержится ли ваше имя в множестве,
// и выводит соответствующее сообщение.


import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("Дима");
        names.add("Вася");
        names.add("Петя");
        names.add("Коля");

       // String nameToCHeck = "Коля";
        String nameToCHeck = "Иван";

        if (names.contains(nameToCHeck)){
            System.out.println("tru");
        }
        else {
            System.out.println("false");
        }
    }




}
