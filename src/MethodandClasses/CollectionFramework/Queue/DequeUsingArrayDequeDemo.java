package MethodandClasses.CollectionFramework.Queue;

import java.util.*;
public class DequeUsingArrayDequeDemo {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
                = new ArrayDeque<String>();

//         add() method to insert
        dq.add("For");
        dq.addFirst("Deque");
        dq.addLast("Deque");
        dq.add("is so good");

//        dq.add("Java");
//        dq.add("is");
//        dq.add("programming");
//        dq.add("Language");

        Iterator itr = dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        Iterator itr1 = dq.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}

