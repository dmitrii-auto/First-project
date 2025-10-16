package HomeWork_11.Task_9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {

    /*
    Тесты должны проверять:
    Пустую строку
    null
    Строку с несколькими пробелами
     */


    @ParameterizedTest
    @CsvSource({
            "'привет, мир', 2",
            "'', 0",
            "'привет,       мир 2', 3",
            "'п', 1"
    })
    public void PositiveCountWordsTest(String line, int expectedCount){
        CountWords countWords = new CountWords();

        assertEquals(expectedCount, countWords.countWords(line));
    }

    @Test
    public void NullCountWordsTest(){
        CountWords countWords = new CountWords();

        assertThrows(NullPointerException.class, () ->countWords.countWords(null));

    }

}
