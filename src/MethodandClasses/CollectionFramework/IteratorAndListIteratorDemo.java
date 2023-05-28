package MethodandClasses.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIteratorDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Welcome");
        myList.add("To");
        myList.add("Iterator");
        myList.add("Vs");
        myList.add("ListIterator");

        // Using Iterator to traverse the list
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("=================================================");

        // Using ListIterator to traverse the list
        ListIterator<String> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }
        System.out.println("------------------------------------------------");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}

