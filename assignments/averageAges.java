package assignments;
import java.util.Scanner;
public class averageAges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAge = 0;   
        int numberOfUsers = 5;

        // Array to store names
        String[] names = new String[numberOfUsers];

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("User " + (i + 1));

            System.out.print("Enter your name: ");
            names[i] = scanner.nextLine();  // store name in array

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            totalAge += age;  
            System.out.println();
        }

        double averageAge = (double) totalAge / numberOfUsers;

        // Print all stored names
        System.out.println("Names of users entered:");
        for (String name : names) {
            System.out.println("- " + name);
        }

        // Print average
        System.out.println("\nThe average age of the 5 users is: " + averageAge);

        scanner.close();
    }
}


