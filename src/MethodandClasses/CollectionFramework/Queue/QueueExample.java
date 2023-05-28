package MethodandClasses.CollectionFramework.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("Addidas");
        queue.add("Nike");
        queue.add("Puma");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("Hummels");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue using iterator
        Iterator iterator = queue.iterator();
        System.out.println("Remaining queues are: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
