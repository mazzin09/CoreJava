package MethodandClasses.OOP;

class Measurement {
    private double breadth;
    private double length;

    Measurement(double b, double l){
        breadth = b;
        length = l;
    }

    Measurement(double res){

        breadth = length = res;
    }

    double areaOfLand(){

        return breadth * length;
    }
}



class AreaLand extends Measurement{
    AreaLand(double b, double l){

        super(b, l);
    }

    AreaLand(double res){
        super(res);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        AreaLand al = new AreaLand(20,30);
        AreaLand al1 = new AreaLand(15);

        double area;

        area = al.areaOfLand();
        System.out.println("Area of a rectangular shape land: " + area);

        area = al1.areaOfLand();
        System.out.println("Area of a square shape land: " +area);
    }
}
