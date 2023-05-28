package MethodandClasses;

class Box{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Volume: ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box();

    box1.width = 10;
    box1.height = 20;
    box1.depth = 25;

    box2.width = 20;
    box2.height = 10;
    box2.depth = 15;

    box1.volume();

    box2.volume();

    }
}
