package oop;

public class interfaces {
    public static void main(String[] args) {
      
        
    }
}
interface Student{
    public void enterClasses();
}
interface SRO {
    public void enterOffices();  
}

class total implements Student, SRO{
    public void enterClasses(){
        System.out.println("this is the enterClasses method from Student interface");
    }
    public void enterOffices(){
        System.out.println("this is the enterOffices method from SRO interface");
    }
}

