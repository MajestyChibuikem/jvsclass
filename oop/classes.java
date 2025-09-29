package oop;

 
public class classes {
    String anAttribute = "this is an attribute";
    static void myMethod(String yourName, int age){
        System.out.println(yourName + " Majesty");
        System.out.println(age);
    }
    public static void main(String[] args) {
      myMethod("chibuikem", 60);
      loopTimesTable();
    }

    static void loopTimesTable(){
      int a = 5;
      for(int b = 0;  b <= 12; b++){
          System.out.println(a * b);
      }
    }
    
}
