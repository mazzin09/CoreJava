package MethodandClasses.CollectionFramework.List;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Print the modified vector
        System.out.println("Vector: " + vector);

        // Perform thread-safe operations
        synchronized (vector) {
            // Access and modify the vector
            for (int i = 0; i < vector.size(); i++) {
                int element = vector.get(i);
                vector.set(i, element * 2);
            }
        }

        // Print the modified vector
        System.out.println("Modified Vector: " + vector);

        // Get the size of the vector
        int size = vector.size();
        System.out.println("Size: " + size);
    }
}

