package HomeWork_12;
import java.util.*;


    public class DebugTask10 {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
            List<String> filtered = names.stream()
                    .filter(name -> !name.startsWith("A"))
                    .toList();

            System.out.println(filtered);
        }
}
