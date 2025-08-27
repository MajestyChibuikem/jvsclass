package assignments;
import java.util.Scanner;
public class passwordchecker {
    // create a var that will hold the password
    // then ask them for the password
    // if false, continue the loop
    //if true, end the program

    public static void main(String[] args) {
        
        Scanner newscanner = new Scanner(System.in);

        //String password
        String password = "password";

        boolean isPassword = true;

        while(isPassword){
            System.out.print("what is your password: ");
            String newPassword = newscanner.next();
            if(newPassword.equals(password)){
                isPassword = false;
            }
            else{
                System.out.println("incorrect password");
            }
        }
        newscanner.close();

    }
}
