package MethodandClasses.FileHandling.Demo1;

import java.io.File;

public class CreatingDemo {
    public static void main(String[] args) {
        try{
            File ob = new File("C:/testFile/test.txt");
            if(ob.createNewFile()){
                System.out.println("File successfully created : " + ob.getName());
            }
            else{
                System.out.println("File Not created");
            }
        }
        catch (Exception e){
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
}
