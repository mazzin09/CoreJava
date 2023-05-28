package MethodandClasses.FileHandling.Demo1;

import java.io.FileWriter;

public class WritingDemo {
    public static void main(String[] args) {
        try{
            FileWriter wr = new FileWriter("C:/testFile/test.txt");
            wr.write("Hello I am testing this from java code. Hope it works");
            wr.close();
            System.out.println("Succesfully written some text in file");
        }
        catch (Exception e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
