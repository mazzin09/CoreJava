package MethodandClasses.FileHandling.StreamAndCollection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferenceDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("orange");

//        fruits.remove("Apple");


        for (int i = 0; i < fruits.size(); i ++){
            System.out.println(fruits.get(i));
        }


//        System.out.println("----------------------------------------------");
//
//        for (int i = 0; i < fruits.size(); i ++){
//            System.out.println(fruits.get(i));
//        }

        System.out.println("===========================================");

        List<String> result = fruits.stream()
                .filter(line -> !"orange".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        System.out.println("===========================================");

        List <Integer> numbers = Arrays.asList(4,2,3,1,6,7,8,9,5);

        Stream <Integer> aboveFive = numbers.stream().filter(i -> i >= 5).sorted();

        aboveFive.forEach(System.out::println);

        aboveFive.forEach(System.out::println);

    }
}
