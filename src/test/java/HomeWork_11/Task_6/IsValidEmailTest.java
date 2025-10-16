package HomeWork_11.Task_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailTest {

    /*
    Тесты должны проверять:
    Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
    null
     */

    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "12@12.com",
            "b@a.com"
    })
    public void IsValidEmailTest(String email){
        IsValidEmail isValidEmail = new IsValidEmail();

        assertTrue(isValidEmail.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "",
            ""
    })
    public void IsNotValidEmailTest(String email){
        IsValidEmail isValidEmail = new IsValidEmail();

        assertFalse(isValidEmail.isValidEmail(email));
    }

    @Test
    public void IsNullEmailTest(){
        IsValidEmail isValidEmail = new IsValidEmail();
        assertThrows(IllegalArgumentException.class, () -> isValidEmail.isValidEmail(null));
    }



}
