package assignments;
import java.util.Scanner;
public class adults {
    public static void main(String[] args) {
        //if the user inputs an age below 18, keep them in the prorgam
        // els exit
        Scanner scanner = new Scanner(System.in);
        boolean notAdult = true;
        while(notAdult){
            System.out.print("what is your age");
            int age = scanner.nextInt();
            if(age >= 18){
                System.out.println("you are an adult");
                notAdult = false;
            }
            else{
                System.out.println("you are below 18, try again");
            }
        }
        scanner.close();
    }
}
