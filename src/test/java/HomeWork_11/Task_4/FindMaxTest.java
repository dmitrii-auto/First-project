package HomeWork_11.Task_4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest {

    /*
    Тесты должны проверять:
    Обычный массив ([3, 5, 7, 2])
    Один элемент в массиве
    Отрицательные числа
    Пустой массив (должно выбрасываться исключение)
     */

    public static Stream<org.junit.jupiter.params.provider.Arguments> LinesForPositiveReverseTest(){
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(new int []{3, 5, 7, 2},7),
                org.junit.jupiter.params.provider.Arguments.of(new int []{3},3),
                org.junit.jupiter.params.provider.Arguments.of(new int []{-3},-3),
                org.junit.jupiter.params.provider.Arguments.of(new int []{-3, -5, -7, -2},-2)

        );
    }

    @ParameterizedTest
    @MethodSource("LinesForPositiveReverseTest")
    public void FindMaxPositiveTest(int[] number, int maxNumber){
        FindMax findMax = new FindMax();

        assertEquals(findMax.findMax(number),maxNumber);
    }

    @Test
    public void FindMaxNegativeTest(){
        FindMax findMax = new FindMax();

        assertThrows(NullPointerException.class, () ->
                findMax.findMax(null));
    }
}
