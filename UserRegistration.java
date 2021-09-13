
//Last Name
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Created a class for user inputs and validation
public class UserRegestration {
    void regestration(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scan.next();
        System.out.println("Enter Your Last Name");
        String lastName = scan.next();

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";
        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);
        Matcher matcher1 = pattern.matcher(lastName);
        System.out.println("valid first Name: "+matcher.matches());
        System.out.println("valid last Name: "+matcher1.matches());
    }
}

//Main class to call out functions
class Main{
    public static void main(String[] args) {
        UserRegestration user = new UserRegestration();
        user.regestration();
    }
}