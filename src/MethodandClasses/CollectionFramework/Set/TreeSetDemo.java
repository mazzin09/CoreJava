package MethodandClasses.CollectionFramework.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("Apple");
        ts.add("Samsung");
        ts.add("Microsoft");
        ts.add("Google");
//        ts.add(true);

        // Using Iterator to traverse the set
        Iterator<Object> iterator = ts.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        System.out.println("-------------------------------------------");

        TreeSet ts1 = new TreeSet();
        ts1.add(101);
        ts1.add(1001);
        ts1.add(111);
        ts1.add(100);
//        ts1.add(null);

        // Using Iterator to traverse the set
        Iterator<Object> iterator1 = ts1.iterator();
        while (iterator1.hasNext()) {
            Object element = iterator1.next();
            System.out.println(element);
        }
    }
}
