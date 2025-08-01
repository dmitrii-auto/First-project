package HomeWork_6.ArrayList;
//Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>(Arrays.asList("Hi", "Привет", "Как дела?", "Норм"));

        AtomicReference<String> maxLine = new AtomicReference<>("");

        lines.forEach(
                line -> {
                    if (line.length() > maxLine.get().length()){
                        maxLine.set(line);
                    }
                }
        );
        System.out.println(maxLine.get());
    }
}
