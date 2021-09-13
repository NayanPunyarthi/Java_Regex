
//Valid PhoneNumber

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



//Created a class for user inputs and validation
public class UserRegistration {
    Scanner scan = new Scanner(System.in);

    void checkName(){
        System.out.println("Enter Your Name");
        String name = scan.next();

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);

        System.out.println("valid first Name: " + matcher.matches());

    }
    void checkLastName(){
        System.out.println("Enter Your Name");
        String lastName = scan.next();

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(lastName);


        System.out.println("valid last Name: " + matcher.matches());

    }

    void checkEmail() {
        System.out.println("Enter Your email");
        String email = scan.next();

        String emailRegex = "^[a-z]{3}[a-zA-Z0-9+_.-]+@[bl.co]{5}[a-z.]+$";

        boolean result = email.matches(emailRegex);
        if (result) {
            System.out.println("Given email-id is valid");
        } else {
            System.out.println("Given email-id is not valid");
        }
    }
    void checkPhone() {
        System.out.println("Enter Your phone number");
        String phoneNo = scan.next();

        String Regex = "^[91]{2}\\s[0-9]{10}$";

        boolean result = phoneNo.matches(Regex);
        if (result) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
    }
}


//Main class to call out functions
class Main{
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.checkPhone();
    }
}
