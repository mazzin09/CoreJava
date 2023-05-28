package MethodandClasses.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet s1 = new HashSet();
        s1.add("Deepak");
        s1.add("Rahul");
        s1.add(20);
        s1.add(1001.12);
        s1.add(true);

        //Null values
//        s1.add(null);
//        s1.add(null);
//        System.out.println("Hash Set doesn't take multiple null values.");

        System.out.println(s1);

        // Using Iterator to traverse the set
        Iterator<Object> iterator = s1.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
