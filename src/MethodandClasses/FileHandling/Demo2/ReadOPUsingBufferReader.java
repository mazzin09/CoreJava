package MethodandClasses.FileHandling.Demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadOPUsingBufferReader {
    public static void main(String[] args) {
        String path = "C:/testFile/test.txt";
//        String path = "C:/testFile/Algorithm 2.pdf";
        BufferedReader buffRead = null;
        try{
            File file = new File(path);
            buffRead = new BufferedReader(new FileReader(file));
            int c = 0;
            long startTime = System.currentTimeMillis();
            while((c = buffRead.read()) != -1){
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
                buffRead.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
