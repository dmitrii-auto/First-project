package HomeWork_13_complex.complex_task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import practice_11.StringProcessor;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {

    private final UserValidator validator = new UserValidator();



    @Test
    public void checkInvalidNameIsEmpty(){
        User user = new User("1", "qwe@mail.com", 20);
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    @Test
    public void checkInvalidNameIsLowercase(){
        User user = new User("dima", "qwe@mail.com", 20);
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    static Stream<User> invalidAge(){
        return Stream.of(
                new User("Dima", "qwe@mail.com", -1),
                new User("Dima", "qwe@mail.com", 0),
                new User("Dima", "qwe@mail.com", 17),
                new User("Dima", "qwe@mail.com", 101)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidAge")
    public void checkInvalidAge(User user){
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    static Stream<User> invalidEmail(){
        return Stream.of(
                new User("Dima", "bad@.com", 25),
                new User("Dima", "no-at-symbol", 25),
                new User("Dima", "", 25),
                new User("Dima", "qwemail.com", 25)
        );
    }

    @ParameterizedTest
    @MethodSource("invalidEmail")
    public void isNotValidEmailTest(User user){
        assertThrows(InvalidUserException.class, () -> validator.validateUser(user));
    }

    @Test
    public void checkValidationEnabled(){
        validator.setValidationEnabled(false);
        User user = new User("", "", 5000);
        assertDoesNotThrow(() -> validator.validateUser(user));
        // validator.setValidationEnabled(true);

        // я непонимаю почему если я не делаю validator.setValidationEnabled(true); - другие кейсы не падают
        // я ведь перевёл setValidationEnabled в false, по идее другие кейсы должны падать, но они не падают
        //перед выполнением каждого кейса setValidationEnabled возвращается в true
    }


    @Test
    public void validUserTest(){
        User user = new User("Dima", "qwe@mail.com", 30);
        assertDoesNotThrow(() -> validator.validateUser(user));
    }
}
