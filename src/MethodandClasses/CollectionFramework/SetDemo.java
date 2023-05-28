package MethodandClasses.CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add(100);
        s1.add(200);
        s1.add(300);
        s1.add(400);
        s1.add(500);

        //Duplicate Elements
        s1.add(100);
        s1.add(200);

        //Null Values
        s1.add(null);
        s1.add(null);

        //Insertion Order
        System.out.println(s1);
    }
}
