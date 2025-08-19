
import java.util.Scanner;
public class rect {
    //lenght * width
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("input your length: ");
        length = scanner.nextInt();

        int width;
        System.out.println("input your width: ");
        width = scanner.nextInt();

        int area = length *  width;
        System.out.println(area);
        scanner.close();
    }
}
