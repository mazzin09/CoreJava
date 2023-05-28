package MethodandClasses.OOP;

class Shape{
    double raidus;
}

class Circle extends Shape{
    double radius;

    Circle(double a, double b){
        super.raidus = a;
        radius = b;
    }

    void show(){
        System.out.println("Radius in superclass: " + super.raidus);
        System.out.println("Radius in sub class : " + radius);
    }
}

public class SuperDemo2 {
    public static void main(String[] args) {
        Circle c = new Circle(10,15);
        c.show();
    }
}
