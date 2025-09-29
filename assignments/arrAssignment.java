package assignments;
import java.util.Scanner;
public class arrAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store name, age, marital status
        String[] userInfo = new String[3];

        // Get input
        System.out.print("Enter your name: ");
        userInfo[0] = scanner.nextLine();

        System.out.print("Enter your age: ");
        userInfo[1] = scanner.nextLine();  // store as string for array consistency

        System.out.print("Enter your marital status: ");
        userInfo[2] = scanner.nextLine();

        // Display stored data
        System.out.println("\nUser Info Stored in Array:");
        System.out.println("Name: " + userInfo[0]);
        System.out.println("Age: " + userInfo[1]);
        System.out.println("Marital Status: " + userInfo[2]);

        scanner.close();
    }

}
