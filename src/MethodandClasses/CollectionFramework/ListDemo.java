package MethodandClasses.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List ab = new ArrayList<>();
        ab.add(7);
        // Index based Data Structure
        ab.add(1,10);
//        ab.add(3,20);

        // Duplicate elements
        ab.add(7);
        ab.add(7);

        // Null values
        ab.add(null);
        ab.add(null);

        System.out.println(ab);

        //Iterator and ListIterator Left
    }
}
