package MethodandClasses.CollectionFramework;

import java.util.LinkedList;

public class LinkedListIntegerDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i ++){
            linkedList.add(i);
        }
        for (int ll : linkedList){
            System.out.println(ll);
        }
        // Ending time
        long endTime = System.nanoTime();

        // Time taken in milliseconds
        long timeElapsed = (endTime - startTime) / 1000000;

        long startTimeAfter = System.nanoTime();

        linkedList.set(40, 1001);
        linkedList.set(60, 1002);
        linkedList.remove(800);
        linkedList.remove(801);

        for (int ll : linkedList){
            System.out.println(ll);
        }
        // Ending time
        long endTimeAfter = System.nanoTime();

        // Time taken in milliseconds
        long timeElapsedAfter = (endTimeAfter - startTimeAfter) / 1000000;

        System.out.println("Time taken By LinkedList Before Insertion: " + timeElapsed + " milliseconds");

        System.out.println("Time taken By LinkedList After Insertion: " + timeElapsedAfter + " milliseconds");
    }
}
