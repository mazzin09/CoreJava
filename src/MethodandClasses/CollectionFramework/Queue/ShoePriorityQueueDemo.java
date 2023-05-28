package MethodandClasses.CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Shoe {
    private String brand;
    private int rating;

    public Shoe(String brand, int rating) {
        this.brand = brand;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return brand + " (Rating: " + rating + ")";
    }
}

public class ShoePriorityQueueDemo {
    public static void main(String[] args) {
        // Custom comparator to compare shoes based on size
        Comparator<Shoe> qualityComparator = Comparator.comparingInt(Shoe::getRating).reversed();

        // Creating a PriorityQueue with the custom size comparator
        PriorityQueue<Shoe> shoeQueue = new PriorityQueue<>(qualityComparator);

        // Adding shoes to the queue
        shoeQueue.add(new Shoe("Nike", 9));
        shoeQueue.add(new Shoe("Adidas", 8));
        shoeQueue.add(new Shoe("Puma", 10));
        shoeQueue.add(new Shoe("Reebok", 7));

        // Retrieving and printing the shoes from the priority queue
        while (!shoeQueue.isEmpty()) {
            Shoe shoe = shoeQueue.poll();
            System.out.println(shoe);
        }
    }
}

