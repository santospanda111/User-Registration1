package UserRegistration;
import org.junit.jupiter.api.Test;

/**
 * here i have tested possible test cases with custom exception.
 * printStackTrace method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err.
 */
public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkFirstName("santosh");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkLastName("Panda");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkEmail("abc-100@yahoo.com");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkPhoneNumber("91 7978715564");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration.checkPassword("Santoshkumar1234@");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
}