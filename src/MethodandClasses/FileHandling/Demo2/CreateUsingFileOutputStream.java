package MethodandClasses.FileHandling.Demo2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateUsingFileOutputStream {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the file name including file path: ");
            String fileName = sc.nextLine();

            FileOutputStream writeFile = new FileOutputStream(fileName);
            System.out.println("Enter the content to the file: ");
            String content = sc.nextLine();

            byte b[] = content.getBytes();
            writeFile.write(b);
            writeFile.close();
            System.out.println("File is saved on given location.");

        }
        catch (Exception e){
            System.out.println("Some Exception is comming..");
            e.printStackTrace();
        }
    }
}
