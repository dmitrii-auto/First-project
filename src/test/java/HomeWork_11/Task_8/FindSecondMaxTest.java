package HomeWork_11.Task_8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest {

    /*
    Тесты должны проверять:
    Обычные массивы
    Массив с одинаковыми числами
    Один элемент в массиве (должно выбрасываться исключение)
     */

    public static Stream<org.junit.jupiter.params.provider.Arguments> PositiveArraysForFindSecondMaxTest(){
        return Stream.of(
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,1,3,4,5},4),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{1,2,3,10,6},6),
            org.junit.jupiter.params.provider.Arguments.of(new int[]{-1,-2,-3,-4,-5},-2)
        );
    }

    @ParameterizedTest
    @MethodSource("PositiveArraysForFindSecondMaxTest")
    public void PositiveFindSecondMaxTest(int[] arrayNumbers, int expected){
        FindSecondMax findSecondMax = new FindSecondMax();

        assertEquals(expected, findSecondMax.findSecondMax(arrayNumbers));
    }

    public static Stream<org.junit.jupiter.params.provider.Arguments> NegativeArraysForFindSecondMaxTest(){
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of((Object) new int[]{1,1,1,1,1}),
                org.junit.jupiter.params.provider.Arguments.of((Object) new int[]{3}),
                org.junit.jupiter.params.provider.Arguments.of((Object) new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("NegativeArraysForFindSecondMaxTest")
    public void PositiveFindSecondMaxTest(int[] arrayNumbers){
        FindSecondMax findSecondMax = new FindSecondMax();

        assertThrows(IllegalArgumentException.class, () -> findSecondMax.findSecondMax(arrayNumbers));
    }
}
