package HomeWork_11.Task_7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    /*
    Тесты должны проверять:
    0! = 1
    Маленькие числа (1!, 5!, 7!)
    Отрицательные числа (должно выбрасываться исключение)
     */

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "5, 120",
            "7, 5040",
    })
    public void CorrectFactorialTest(int number, int expectedResult){
        Factorial factorial = new Factorial();

        assertEquals(factorial.factorial(number),expectedResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1,-5,-7})
    public void CorrectFactorialTest(int number){
        Factorial factorial = new Factorial();

        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(number));
    }
}
