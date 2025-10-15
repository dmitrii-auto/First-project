package HomeWork_11.Task_3;

public class StringReverse {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

}
