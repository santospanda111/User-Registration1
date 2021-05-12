package UserRegistration;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationPrameterizedTest {
    public String email;
    public  boolean expectedResult;
    public UserRegistration userRegistration;
    public UserRegistrationPrameterizedTest(String email,boolean expectedResult){
        super();
        this.email=email;
        this.expectedResult=expectedResult;
    }
    @Before
    public void initiallize(){
        userRegistration=new UserRegistration();
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true}});
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrueParameterisedTest(){
        System.out.println("This is Expected Result "+ this.expectedResult);
        Assertions.assertEquals(this.expectedResult,userRegistration.checkEmail(this.email));
    }
}
