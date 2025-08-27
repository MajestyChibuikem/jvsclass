package assignments;
import java.util.Scanner;
public class yesorno {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Do you want to continue?: y or n");
            String choice = scanner.next().toLowerCase();

            if(choice.equals("n")){
                break;
            }
            else if (choice.equals("y")){
                System.out.println("alright i will continue the program");
                continue;
            }
            else{
                System.out.println("invlaid choice");
            }
        }
        scanner.close();
    }
}
