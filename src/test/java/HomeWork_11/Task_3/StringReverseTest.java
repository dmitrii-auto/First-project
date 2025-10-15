package HomeWork_11.Task_3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringReverseTest {

    /*
    Тесты должны проверять:
    Обычные строки
    Пустую строку
    null (должно возвращаться null)
     */


    public static Stream<Arguments> LinesForPositiveReverseTest(){
        return Stream.of(
                Arguments.of("dima", "amid"),
                Arguments.of("DAMA", "AMAD"),
                Arguments.of("123", "321"),
                Arguments.of("", ""),
                Arguments.of("#$", "$#")
        );
    }

    @ParameterizedTest
    @MethodSource("LinesForPositiveReverseTest")
    public void StringReversePositiveTest(String initialLine, String expectedLine){
        StringReverse stringReverse = new StringReverse();

        assertEquals(stringReverse.reverse(initialLine), expectedLine);
    }

    @Test
    public void StringReverseNullTest(){
        StringReverse stringReverse = new StringReverse();

        assertNull(stringReverse.reverse(null));
    }


}
