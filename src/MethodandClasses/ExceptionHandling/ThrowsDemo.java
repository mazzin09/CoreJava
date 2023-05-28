package MethodandClasses.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("C:/abc.txt");
        System.out.println("We are in throw zone");
    }
}
