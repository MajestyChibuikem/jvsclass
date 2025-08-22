import java.util.Scanner;
public class switching {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        /*
         *char input: A, B, C or D
         if input is A - perfect
         if input is B - very good
         if input is C - good
         if input is D - poor
         finally if E - very poor 
        */
        String grade;
        System.out.print("input your grade: ");
        grade = scanner.next();

        // if(grade.equals("A")){
        //     System.out.println("perfect");
        // }
        // else if(grade.equals("B")){
        //     System.out.println("very good");
        // }
        // else if(grade.equals("C")){
        //     System.out.println("good");
        // }
        // else if(grade.equals("D")){
        //     System.out.println("poor");
        // }
        // else if(grade.equals("E")){
        //     System.out.println("very poor");
        // }
        // else{
        //     System.out.println("not a valid grade");
        // }
        

        switch (grade){
            case "A":
                System.out.println("perfect");
                break;
            case "B":
                System.out.println("very good");
                break;
            case "C":
                System.out.println("good");
                break;
            case "D":
                System.out.println("poor");
                break;
            case "E":
                System.out.println("very poor");
                break;
            default:
                System.out.println("not a valid grade");
        }
    }
}
