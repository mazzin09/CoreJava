package MethodandClasses.OOP2;

abstract class ExampleA{
    abstract void absMethod(); //abstract methods

    void concreteMethod(){
        System.out.println("This is concrete method");
    }
}

class ExampleB extends ExampleA{
    void absMethod() {
        System.out.println("Example B implementing Example A's abstract method");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        ExampleB b1 = new ExampleB();
        System.out.println("================================================");
        b1.absMethod();
        b1.concreteMethod();
    }
}
