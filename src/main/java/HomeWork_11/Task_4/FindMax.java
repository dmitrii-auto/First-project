package HomeWork_11.Task_4;

import java.util.Arrays;

public class FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
