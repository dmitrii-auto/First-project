package HomeWork_11.Task_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {

    /*
    Тесты должны проверять:
    Разные строки ("hello", "java", "AEIOU", "")
    null (должно выбрасываться исключение)
    Строки без гласных
     */

    public static Stream<Arguments> LinesForCountVowelsTest(){
        return Stream.of(
                // строки с гласными
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("hello", 2),
                // строки без гласных
                Arguments.of("hll", 0),
                Arguments.of("XXXXXX", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("LinesForCountVowelsTest")
    public void CountOneOrMoreVowelsTest(String line, int expectedCount){
        CountVowels countVowels = new CountVowels();

        assertEquals(countVowels.countVowels(line), expectedCount);
    }


    @DisplayName("Проверка на NULL")
    @Test
    public void CountNullVowelsTest(){
        CountVowels countVowels = new CountVowels();

        assertThrows(IllegalArgumentException.class, () ->{
            countVowels.countVowels(null);
        }
    );
    }
}
