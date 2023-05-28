package MethodandClasses;

class Overload {
    void test(){
        System.out.println("Test without parameter");
    }

    void test(int a){
        System.out.println("a: " + a);
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + b);
    }

    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Overload overLoad = new Overload();
        System.out.println("===========================================");
        overLoad.test();
        overLoad.test(10);
        overLoad.test(21, 22);
        double result = overLoad.test(12.32);
        System.out.println("Result of double parameter: " + result);
    }
}
