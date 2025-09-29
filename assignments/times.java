package assignments;
import java.util.Scanner;
public class times {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        /*
         * 1 * 1 a b+1
         * 1 * 2
         * 1 * 3
         * 1 * 4
         * 1 * 5
         * 1 * 6
         * 1 * 7
         * 1 * 8
         * 1 * 9
         * 1 * 10
         * 1 * 11
         * 1 * 12
         * 
         * 
         * 
        */
        System.out.print("input your number:");
        int a = scanner.nextInt();
        // int b = 1;
        // while (b <= 12){ // b = 1
        //     System.out.println(a*b); // a * 2
        //     b++; // b = 2 + 1
        // }
        for(int b = 0;  b <= 12; b++){
            System.out.println(a * b);
        }
        scanner.close();
    }
}
