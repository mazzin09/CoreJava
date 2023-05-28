package MethodandClasses.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> programming = new ArrayList<>();

        // Adding elements to the ArrayList
        programming.add("C");
        programming.add("C++");
        programming.add("Python");
        programming.add(null);
        programming.add(null);
        programming.add("java");

        // Accessing elements of the ArrayList
        System.out.println("First programming in the list: " + programming.get(0));
        System.out.println("Second programming in the list: " + programming.get(1));

        // Updating an element in the ArrayList
        programming.set(1, "Java");

        // Removing an element from the ArrayList
        programming.remove(2);

        // Looping through the ArrayList using a for-each loop
        for (String program : programming) {
            System.out.println(program);
        }

        // Getting the size of the ArrayList
        System.out.println("Number of Language: " + programming.size());
    }
}
