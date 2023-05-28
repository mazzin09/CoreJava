package MethodandClasses;

class BoxReturn{
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
}

public class ReturnType {
    public static void main(String[] args) {
        BoxReturn box1 = new BoxReturn();
        BoxReturn box2 = new BoxReturn();
        double vol;

        box1.width = 10;
        box1.height = 20;
        box1.depth = 25;

        box2.width = 20;
        box2.height = 10;
        box2.depth = 15;

        vol = box1.volume();
        System.out.println("Volume :" + vol);

        vol = box2.volume();
        System.out.println("Volume :" + vol);
    }
}
