package HomeWork_6.ArrayList;
// Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.


import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        number.add(6);

        System.out.println(number);
    }

}
