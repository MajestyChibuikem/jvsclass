import java.util.Scanner;
public class control {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        System.out.print("what is our height: ");
        float height = newscanner.nextFloat();
        if(height > 6.0){
            System.out.println("you are tall");
        }
        else if (height > 3.5){
            System.out.println("you are of meduim height");
        }
        else{
            System.out.println("you are short");
        }
    }
}
