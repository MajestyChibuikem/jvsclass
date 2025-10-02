package oop;

class Animal{
    int x = 5;
    int z = 80;
    class dog{
        int y = 10;
        int display(){
            System.out.println(z);
            return x + y;
        }
    }
}


public class innerExample {
    public static void main(String[] args) {

        Animal newAnimal = new Animal();

        Animal.dog newDog = newAnimal.new dog();

        System.out.println(newAnimal.x);
        System.out.println(newDog.y);
        
    }
}
