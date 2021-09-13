
/Valid Email ID
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This is a User Resgistration Problem where the code needs to ensure that all the validations are in place during user entry

//Created a class for user inputs and validation
public class UserRegistration {
    void registration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.next();
        System.out.println("Enter Your Last Name");
        String lastName = scan.next();
        System.out.println("Enter Your email");
        String email = scan.next();

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";
        String emailRegex = "^[a-z]{3}[a-zA-Z0-9+_.-]+@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]+$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);
        Matcher matcher1 = pattern.matcher(lastName);

        System.out.println("valid first Name: " + matcher.matches());
        System.out.println("valid last Name: " + matcher1.matches());

        boolean result = email.matches(emailRegex);
        if (result) {
            System.out.println("Given email-id is valid");
        } else {
            System.out.println("Given email-id is not valid");
        }
    }
}


//Main class to call out functions
class Main{
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.registration();
    }
}
