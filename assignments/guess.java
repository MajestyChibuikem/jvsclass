package assignments;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        
        //range 1 to 10 
        // guess the secret number
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        boolean incorrectGuess = true;
        int count = 1;
        int end = 5;
        while(incorrectGuess){
            System.out.print("guess the secret number: 1- 10: ");
            int guess = scanner.nextInt();

            if(count >= end){
                incorrectGuess = false;
            }
            else if(guess == secretNumber){
                System.out.println("correct guess");
                incorrectGuess = false;
            }
            else{
                System.out.println("incorrect guess, try again");
                System.out.println("you have tried "+ count+ "times");
                count++;
            }


        }
        scanner.close();
    }
}
