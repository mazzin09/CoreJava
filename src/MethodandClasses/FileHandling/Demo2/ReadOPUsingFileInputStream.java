package MethodandClasses.FileHandling.Demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadOPUsingFileInputStream {
    public static void main(String[] args) {
        String path = "C:/testFile/test.txt";
        FileInputStream readFile = null;
        try{
//            File file = new File(path);
            readFile = new FileInputStream(path);
            int c = 0;
            long startTime = System.currentTimeMillis();
            while((c = readFile.read()) != -1 ){
                System.out.print((char) c);
            }
            long endTime = System.currentTimeMillis();
            long completionTime = endTime - startTime;
            System.out.println("File reading completed in " + completionTime + " milliseconds.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                readFile.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
