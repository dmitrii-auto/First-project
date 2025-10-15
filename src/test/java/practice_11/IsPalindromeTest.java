package practice_11;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{
    /*
    Тесты для проверки является ли полиндромом
    позитивные кейсы:
        - четное количество: "abba" -> true
        - нечётное количество: "hah" -> true

    негативные кейсы:
        "dima" -> false

     угловые кейсы:
         "a" -> true
         "" -> true
         null -> IllegalArgumentException
     */



    @ParameterizedTest
    @ValueSource(strings = {
            // позитивные кейсые
            "abba", "hah",
            // угловые кейсы
            "a", ""
    })
    public void userCanCheckIfValidStringIsPalindrome(String initialString){

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrome(){

        String initialString = "dima";

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome(){
        assertThrows(IllegalArgumentException.class, () ->{
            stringProcessor.isPalindrome(null);
        }, "Проверка того что null является полиндромом должно привести к исключению");
    }

}
