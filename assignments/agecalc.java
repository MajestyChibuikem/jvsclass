package assignments;
import java.util.Scanner;
/*
 * 
 * This program calculates the user's age based on their year of birth.
 * args: users year of birth
 * output: user's age
 */
public class agecalc {
    public static void main (String [] args){
        Scanner newscanner = new Scanner(System.in);
        int DOB;
        String name;
        System.out.print("what is your name: ");
        name = newscanner.next();
        System.out.print("what is your year of birth: ");
        DOB = newscanner.nextInt();
        System.out.println("after the scanner");
    

        int currentYear = 2025;
        int userAge = currentYear - DOB;

        System.out.println("you are " + userAge+"yrs old!!");
        newscanner.close();
    }
    

}
