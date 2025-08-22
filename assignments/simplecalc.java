package assignments;
import java.util.Scanner;
public class simplecalc {
    //two variable
    //output: sum, difference, product, quotient
    public static void main(String[] args) {
        //instantiate and object of the class
        Scanner newscanner = new Scanner(System.in);

        //input for the first number
        System.out.print("what is your first number: ");
        float num1 = newscanner.nextFloat();

        //for the second number
        System.out.print("what is your second number: ");
        float num2 = newscanner.nextFloat();

        //input for the operation
        System.out.print("what is the operation you want to be performed: sum, difference, quotient, product: ");
        String op = newscanner.next();

        if(op.equals("sum")){
            float sum = num1 + num2;
            System.out.println("the sum is "+ sum);
        }
        else if(op.equals("difference")){
            float difference = num1 - num2;
            System.out.println("the difference is : "+difference);
        }
        else if (op.equals("product")){
            float product = num1 * num2;
            System.out.println("the product is " + product);
        }
        else if(op.equals("quotient")){
            float quotient = num1 / num2;
            System.out.println("the quotient is "+ quotient);
        }
        else{
            System.out.println("this is an invlaid operation");
        }
        
        
        

        /*
         * 
         * op
         * if(op == "sum")
        */


        // System.out.println("the sum is "+ sum);
        // 
        // System.out.println("the product is " + product);
        // System.out.println("the quotient is "+ quotient);
        newscanner.close();
    }

}
