package UserRegistration;
import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
    private boolean check;
    private String firstName,lastName,email,phoneNumber,password;
    private static final Scanner SCANNER  = new Scanner(System.in);
/**
 * This checkFirstname method will check the user input according to the pattern.
 * for this operation i have imported regex module and Scanner module.
 */
    public void checkFirstName() {
        System.out.println("Enter First-name starts with capital letter and has minimum 3 character : ");
        firstName = SCANNER.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
        if (!check) {
            System.out.println("Invalid!!Please Enter your name according to the instruction.");
            checkFirstName();
        }
        else {
            System.out.println(" It's a Valid Firstname ");
        }
    }

    /**
     * This checkLastname method will check the user input according to the pattern.
     */
    public void checkLastName() {
        System.out.println("Enter Lastname starts with capital letter and has minimum 3 character : ");
        lastName = SCANNER.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
        if (!check) {
            System.out.println("Invalid!!Please Enter your name according to the instruction.");
            checkLastName();
        }
        else
            System.out.println(" It's a valid Lastname ");
    }

    /**
     * Added checkEmail method to match the email ids according to the given pattern.
     */
    public void checkEmail() {
        System.out.println("Enter a valid email(Eg. abc.xyz@bl.co.in) : ");
        email = SCANNER.nextLine();
        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
        if (!check) {
            System.out.println(" Invalid!!Email-id...Please Enter a Valid one. ");
            checkEmail();
        }
        else {
            System.out.println(" Email-Id is valid ");
        }
    }

    /**
     * This checkPhonenumber method will check the user input(Mobile Number) according to the pattern.
     */
    public void checkPhoneNumber() {
        System.out.println("Enter Your Mobile Number (Eg. 91 9919819801) : ");
        phoneNumber = SCANNER.nextLine();
        check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
        if (!check) {
            System.out.println(" Number is invalid!!Please Enter a Valid one. ");
            checkPhoneNumber();
        }
        else {
            System.out.println("Valid Number ");
        }
    }

    /**
     * Password must be of 8 characters.
     * Have one Uppercase Letter.
     * Have a Special Character(Eg-@$^)"
     * Must Have a Number.
     */
    public void checkPassword() {
        System.out.println("Enter Password(min 8 characters): ");
        System.out.println("*Must have one Uppercase Letter(A-Z)");
        System.out.println("*Have a Special Character(Eg-@$^)");
        System.out.println("*Have a Number(0-9)");
        password = SCANNER.nextLine();
        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,}.*$").matcher(password).matches();
        if (!check) {
            System.out.println(" Invalid Password!! Enter a valid one. ");
            checkPassword();
        }
        else {
            System.out.println(" Password is valid ");
        }
    }
    public void givenEmailsCheck(){
        System.out.println("Now Checking the given Emails............");
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc@yahoo.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\-.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc-100@yahoo.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc.100@yahoo.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc111@abc.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\-.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc-100@abc.net"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc.100@abc.com.au"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc@1.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc@gmail.com.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+(?:\\+.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$","abc+100@gmail.com"));
    }

    public static void main(String[]args) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();
        user.checkLastName();
        user.checkEmail();
        user.checkPhoneNumber();
        user.checkPassword();
        user.givenEmailsCheck();
    }
}
