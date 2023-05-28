package MethodandClasses.OOP2;

 interface Shape{
    public double getArea();
    public double getPerimeter();
}

class CircleInterface implements Shape{
     private double radius;
     public CircleInterface(double radius){
         this.radius = radius;
     }

     public double getArea(){
         return Math.PI * radius * radius;
     }

     public double getPerimeter(){
         return 2 * Math.PI * radius;
     }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        CircleInterface circle = new CircleInterface(15);
        System.out.println("===================================================");
        double area = circle.getArea();
        System.out.println("Area for circle is: " + area);
        double perimeter = circle.getPerimeter();
        System.out.println("Perimeter for circle is: " + perimeter);
    }
}
