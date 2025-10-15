package HomeWork_11.Task_8;

import java.util.Arrays;

public class FindSecondMax {

    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

}
