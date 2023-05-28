package MethodandClasses.ExceptionHandling;

import java.io.FileInputStream;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("C:/abc.txt");
        }
       catch (Exception e){
//            e.printStackTrace();
           System.out.println(e.getMessage());
       }
        finally {
            System.out.println("Entered in final block");
        }
    }
}
