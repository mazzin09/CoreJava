package MethodandClasses.FileHandling.Demo1;

import java.io.File;

public class InformationDemo {
    public static void main(String[] args) {
        File ob1 = new File("C:/testFile/test.txt");
        if(ob1.exists()){
            //File name
            System.out.println("Name of the file: " + ob1.getName());
            //File Path
            System.out.println("File path: " + ob1.getPath());
            //Check whether file is writeable or not
            System.out.println("is File writeable? : " +ob1.canWrite());
            //Check whether file is readable or not
            System.out.println("is File readable? : " +ob1.canRead());
            //Length of the file
            System.out.println("The size of file is: " +ob1.length());
        }
        else{
            System.out.println("The file doesn't exists.");
        }
    }
}
