package HomeWork_6.HashMap;
// Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.


import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Дима", 18);
        people.put("Коля", 20);
        people.put("Петя", 30);
        people.put("Олег", 10);
        people.put("Гриша", 14);


        System.out.println(people);

        people.forEach(
                (name, yearsOld) ->{
                    System.out.println(name + " " +yearsOld);
                }
    );

    }
}
