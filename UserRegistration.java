
//First Name
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This is a User Resgistration Problem where the code needs to ensure that all the validations are in place during user entry

//Created a class for user inputs and validation
public class UserRegistration {
    void registration(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.next();

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";
        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);
        System.out.println("valid input: "+matcher.matches());
    }
}

//Main class to call out functions
class Main{
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.registration();
    }
}


