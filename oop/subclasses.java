package oop;

public class subclasses {
    public static void main(String[] args) {
        System.out.println("this is the main method");
    }
    static void takeaway(){
        System.out.println("take me away");
    }

}
class anotherClass1{
    private String name = "majesty";
    private String color = "matte black";

    //getter methods
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    //setter methods

    public void setName(String name){
        this.name  = name;
    }
    public void setColor(String color){
        this.color = color;
    }
}
abstract class takefromHere{
    public String name = "majesty";
    public String color = "matte black";
    abstract void display();
}


class anotherClass extends takefromHere{
    void display(){
        System.out.println("this is the display method from anotherClass");
    }
    static void show(){
        System.out.println("this is the show method from anotherClass");
    }
}


