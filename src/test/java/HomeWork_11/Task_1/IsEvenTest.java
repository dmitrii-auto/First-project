package HomeWork_11.Task_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest {

    /*
    Тесты должны проверять:
    Чётные и нечётные числа
    Нулевое значение
    Отрицательные числа

    Положительные кейсы:
    2 -> true
    10 -> true
    0 -> true
    -2 -> true
    -10 -> true

    Негативные кейсы:
    3 -> false
    11 -> false
    -2 -> false
    -11 -> false
     */

    @ParameterizedTest
    @ValueSource(ints = {2,10,0,-2,-10})
    public void CheckNumberIsEvenTest(int number){
        IsEven isEven = new IsEven();

        assertTrue(isEven.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,11,-3,-11})
    public void CheckNumberIsNotEvenTest(int number){
        IsEven isEven = new IsEven();

        assertFalse(isEven.isEven(number));
    }

}
