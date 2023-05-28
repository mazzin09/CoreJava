package MethodandClasses.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntegerDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(1000);
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000 ; i ++){
            arrayList.add(i);
        }
//        System.out.println(arrayList.size());

            for (int al : arrayList){
                System.out.println(al);
            }

        // Ending time
        long endTime = System.nanoTime();

        // Time taken in milliseconds
        long timeElapsed = (endTime - startTime) / 1000000;

        long startTimeAfter = System.nanoTime();

        arrayList.set(40, 1001);
        arrayList.set(60, 1002);
        arrayList.remove(800);
        arrayList.remove(801);

        for (int al : arrayList){
            System.out.println(al);
        }
        // Ending time
        long endTimeAfter = System.nanoTime();

        // Time taken in milliseconds
        long timeElapsedAfter = (endTimeAfter - startTimeAfter) / 1000000;

        System.out.println("Time taken By ArrayList Before Insertion: " + timeElapsed + " milliseconds");

        System.out.println("Time taken By ArrayList After Insertion: " + timeElapsedAfter + " milliseconds");
    }
}
