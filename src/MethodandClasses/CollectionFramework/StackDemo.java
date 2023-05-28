package MethodandClasses.CollectionFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a stack
        Stack<String> stack = new Stack<>();

        // Pushing items onto the stack
        stack.push("Java");
        stack.push("is");
        stack.push("programming");
        stack.push("language");

        // Printing the stack
        System.out.println("Stack: " + stack);

        // Popping an item
        String poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);

        // Printing stack again
        System.out.println("Stack after pop: " + stack);

        // Peeking the top item
        String topItem = stack.peek();
        System.out.println("Top item: " + topItem);

        // Searching on the stack
        int searchItem = stack.search("Java");
        System.out.println("Search Index: " + searchItem);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}

