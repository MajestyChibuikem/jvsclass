package oop;
public class sumOverload{
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1,2,3,4);
    }
    static void add(int a, int b){
        System.out.println(a + b);
    }
    static void add(int a, int b, int c){
        System.out.println(a + b+ c);
    }
    static void add(int a, int b, int c, int d){
        System.out.println(a + b+ c + d);
    }
}