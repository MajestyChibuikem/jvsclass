import java.util.Scanner;
public class trycatch {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        try{
            System.out.print("whatis your name: ");
            age = scanner.nextInt();
        }
        catch(java.util.InputMismatchException e){
            System.out.println("you gave your age in an incorrect format");  
        }
        System.out.println(age);
        scanner.close();
    }
}
