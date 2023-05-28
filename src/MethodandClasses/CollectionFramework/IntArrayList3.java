package MethodandClasses.CollectionFramework;

import java.util.Scanner;

public class IntArrayList3 {

    public int grow(int a){
        System.out.println("In grow function: "+ a);
        return 1;
    }
    public boolean add(int a){
        System.out.println("In add function :" + a);
        grow(a);
        return true;
    }
    public static void main(String[] args) {
        int a = 0;

    }
}
