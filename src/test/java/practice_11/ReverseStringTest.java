package practice_11;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Класс StringProcessor, метод reverse")
public class ReverseStringTest  extends StringProcessorTest{

    /**
     * Тесты для переворота строки:
     * happy path: "Дима" - > "амид"
     * corner cases:
     *      "" - > ""
     *      "a" -> "a"
     *      null -> исключение
     */

    public static Stream<Arguments> validStrinsToReverse(){
        return Stream.of(
                Arguments.of("dima", "amid"),
                Arguments.of("", ""),
                Arguments.of("a", "a"));
    }


    @ParameterizedTest
    @MethodSource("validStrinsToReverse")
    public void userCanReverseValidString(String initialString, String expectedString){
        String reversedString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, reversedString, "Строка преобразовалась неверно");
    }

    @Test
    public void userCannotReverseNullString(){
        assertThrows(IllegalArgumentException.class, () ->{
            stringProcessor.reverse(null);
        }, "Ревёрс нула должен привести к исключению");
    }


}
