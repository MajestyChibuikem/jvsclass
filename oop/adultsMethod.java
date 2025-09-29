package oop;
import java.util.Scanner;
import oop.*;
public class adultsMethod {
    public static void main(String[] args) {
        //if the user inputs an age below 18, keep them in the prorgam
        // els exit
        Scanner scanner = new Scanner(System.in);
        Car car = new Car("5 meters", 2,3,"red", "Aventador", "3 of 5");
        // checkAdult(0, scanner);
        Human human = new Human();
        human.setNoOfEyes(10);
        System.out.println(human.getNoOfEye());

        //calling the simpleLoop method
        simpleLoop();
        System.out.println("first loop is done");
        simpleLoop();
        System.out.println("second loop is done");
        simpleLoop();
        System.out.println("third loop is done");
        scanner.close();
    }
    













    static void simpleLoop(){
        int start = 1;

        //ending point
        int stop = 50;
        while(start <= stop){
            
            
            System.out.println(start);
            start++;
            
           
        }
       
    }
    static void simpleLoop(int a){
        int start = 1;
        //ending point
        int stop = 50;
        
        while(start <= stop){
            System.out.println(start);
            start++;
        }
    }



    static void checkAdult(int age, Scanner scanner){
        boolean notAdult = true;
        while(notAdult){
            System.out.print("what is your age");
            age = scanner.nextInt();
            if(age >= 18){
                System.out.println("you are an adult");
                notAdult = false;
            }
            else{
                System.out.println("you are below 18, try again");
            }
        }
    }
}
