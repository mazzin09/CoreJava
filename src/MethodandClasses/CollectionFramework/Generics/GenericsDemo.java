package MethodandClasses.CollectionFramework.Generics;

public class GenericsDemo {
    public static void main(String[] args) {

        Box<String> box = new Box<>("String Type");
        System.out.println(box.getValue());

        Box<Integer> box1 = new Box<>(111);
        System.out.println(box1.getValue());

        box.container = "This is done for type safety purpose";
        box1.container = 147;

        Box<Boolean> box2 = new Box<>(true);
        System.out.println(box2.getValue());

        box.selectType();
        box1.selectType();
    }
}
