package UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = UserRegistration.checkFirstName("Santosh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = UserRegistration.checkLastName("Santosh");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = UserRegistration.checkEmail("santospanda111@gmail.com");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = UserRegistration.checkPhoneNumber("91 7978715564");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistration validator = new UserRegistration();
        boolean result = UserRegistration.checkPassword("Santoshkumar1234@");
        Assertions.assertTrue(result);
    }
}