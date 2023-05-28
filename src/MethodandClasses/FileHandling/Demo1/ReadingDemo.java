package MethodandClasses.FileHandling.Demo1;

import java.io.FileReader;
import java.util.Scanner;

public class ReadingDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:/testFile/test.txt");
            Scanner fReader = new Scanner(fr);
            while (fReader.hasNextLine()){
                String fileData = fReader.nextLine();
                System.out.println(fileData);
            }
            fReader.close();
        }
        catch (Exception e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
