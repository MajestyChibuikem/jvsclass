package fileHandling;

import java.io.File;

public class booleans {
    
    public static void main(String[] args) {
        File newFile = new File("hello.txt");
        System.out.println(newFile.canRead());  //checks if the file is readable  
        System.out.println(newFile.canWrite()); //checks if the file is writable
        System.out.println(newFile.getAbsolutePath());
        System.out.println(newFile.length());
        System.out.println(newFile.getName());
    }

}
