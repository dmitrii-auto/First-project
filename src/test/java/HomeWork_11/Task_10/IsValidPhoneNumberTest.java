package HomeWork_11.Task_10;

import HomeWork_11.Task_9.CountWords;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest {

    /*
    Тесты должны проверять:
    Корректные номера ("+1 1234567890")
    Некорректные номера ("12345", "invalid")
     */

    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890",
            "+2 1234567000",
            "+3 1000067890",
            "+4 0000000000",
    })
    public void IsValidPhoneNumberTest(String phone){
        IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();

        assertTrue(isValidPhoneNumber.isValidPhoneNumber(phone));
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "1 1234567890",
            "",
            "+3 ",
            "+4 hjk",
            "hjkl",
            "123123"
    })
    public void IsNotValidPhoneNumberTest(String phone){
        IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();

        assertFalse(isValidPhoneNumber.isValidPhoneNumber(phone));
    }

    @Test
    public void IsNullPhoneNumberTest(){
        IsValidPhoneNumber isValidPhoneNumber = new IsValidPhoneNumber();

        assertThrows(NullPointerException.class, () ->isValidPhoneNumber.isValidPhoneNumber(null));

    }

}
