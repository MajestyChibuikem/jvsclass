package oop;

public class objectClass {
    public static void main(String[] args) {
        System.out.println("this is the main method");
        // Car myCar = new Car("5 meters", 2,3,"red", "Aventador", "3 of 5");
        // myCar.start();
        // myCar.stop(4);

        
        Cat myCat = new Cat("Clover", 4, "blue");
        myCat.name = "mittens";
        myCat.color = "white";
        myCat.meow();
        Dog newDog = new Dog("sparky",4, "brown");
       
    }
}
class Cat{
  //attributes
  String name;
  int noOfLimbs;
  String color;


  Cat(String name){
    this(name, 4, "black");
  }
  Cat(String name, int noOfLimbs){
    this(name,noOfLimbs,"black");
  }
  Cat(String name, int noOfLimbs, String color){
    this.name = name;
    this.noOfLimbs = noOfLimbs;
    this.color = color;
  }
  void meow(){
    System.out.println("meow meow");
  }

}
class Dog{
  String name;
  int noOfLimbs;
  String color;

  Dog(String name, int noOflimbs, String color){
    this.name = name;
    this.noOfLimbs = noOflimbs;
    this.color = color;
  }
}
class Car{
    String height;
    int noOfDOors;
    int noOfWindows;
    String color;
    String name;
    String modelNo;
    //constructor for the clas "Car"
    Car(String height,int noOfDOors, int noOfWindows, String color, String name, String modelNo){
      this.height = height;
      this.noOfDOors = noOfDOors;
      this.noOfWindows = noOfWindows;
      this.color = color;
      this.name = name;
      this.modelNo = modelNo;

    }
    void start(){
      System.out.println("the car is started");
    }
    void stop(int age){
      System.out.println("the car is stopped");
    }
}
