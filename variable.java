public class variable{
    public static void main(String[] args){
        // datatype nameofthevar = value;

        String name = "Majesty";

        //byte. -128 to 127
        // short -32,768 to 32,767
        //, int -2,147,483,648 to 2,147,483,647
        //, long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    


        //float -7 3.123456 
        //double -15 3.123456789111213
    
        int testpoint = 10;
        int number = 3;

        //no of balls
        int noOfBalls = 10;
        boolean isTrue = true;
        float gpa = 3.5f;
        char grade = 9;

        short whole = 128;
        double deci = 10.123456789111213d;
        System.out.println(name);
        System.out.println(testpoint);
        System.out.println(number);
        System.out.println(noOfBalls);
        System.out.println(isTrue);
        System.out.println(gpa);
        System.out.println(grade);
        System.out.println(whole);
        System.out.println(deci);

        String bigA = "A";
        String smallA = "a";
        boolean anything =  (bigA == smallA);//is 1 less than 0?
        System.out.println(anything);
    }
}