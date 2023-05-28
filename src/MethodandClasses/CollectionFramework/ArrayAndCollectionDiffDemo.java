package MethodandClasses.CollectionFramework;

import java.util.ArrayList;

public class ArrayAndCollectionDiffDemo {
    public static void main(String[] args) {

        String[] name = {"Anish", "Daniel", "Bicky" , "Biren"};
        int[] number = {1,20,14,50,20,13,323,12};
//        int[] number2 = {1,1.5,25};

        System.out.println("------------------------------------------------------");

        ArrayList al = new ArrayList();
        al.add("Daniel");
        al.add(50);
        System.out.println(al);
    }
}
