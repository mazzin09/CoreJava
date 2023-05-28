package MethodandClasses.StaticandFinal;

public class Circle {
    public final static double pi = 3.14159;
    double radius;

    public static double calculateArea(double radius){
        double result = pi * radius * radius;
        return result;
    }
}
