package MethodandClasses.FileHandling.Demo1;

import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        File fo = new File("C:/testFile/test1.txt");
        if(fo.delete()){
            System.out.println(fo.getName() + " File has been deleted");
        }
        else{
            System.out.println("Unexpected Error found while deleting the file");
        }
    }
}
