package HomeWork_11.Task_5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {

    /*
    Тесты должны проверять:
    Обычные годы
    Високосные (2020, 2000, 1600)
    Года, которые делятся на 100, но не на 400 (1900, 2100)
     */

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    public void IsLeapYearTest (int year){
        IsLeapYear isLeapYear = new IsLeapYear();

        assertTrue(isLeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2021, 2025, 1603, 2100})
    public void IsNotLeapYearTest (int year){
        IsLeapYear isLeapYear = new IsLeapYear();

        assertFalse(isLeapYear.isLeapYear(year));
    }
}
