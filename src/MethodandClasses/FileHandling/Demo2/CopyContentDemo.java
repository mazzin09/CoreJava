package MethodandClasses.FileHandling.Demo2;

import java.io.*;

public class CopyContentDemo {
    public static void main(String[] args) {
        copyFile();
    }

    public static void copyFile(){
        File r = new File("C:/testFile/test.txt");
        File w = new File("C:/testFile/test-copy.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            fileInputStream = new FileInputStream(r);
            fileOutputStream = new FileOutputStream(w);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try{
//            System.out.println("Hello");
            System.out.println(fileInputStream.available());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try{
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //close the streams
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
