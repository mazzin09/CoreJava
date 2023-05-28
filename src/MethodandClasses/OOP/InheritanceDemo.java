package MethodandClasses.OOP;

class A{
    int i,j;
    void showOnlyIJ(){
        System.out.println("Showing i and j value: " + i +" " + j);
    }
}

class B extends A{
    int k;
    void showOnlyK(){
        System.out.println("Showing k value: " + k);
    }

    void sumOfAll()
    {
        System.out.println("Sum of i , j & k : " + (i + j + k ));

    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        A superA = new A();
        B subB = new B();

        superA.i = 10;
        superA.j = 20;
        System.out.println("==================================================");
        superA.showOnlyIJ();
        System.out.println();

        subB.i = 11;
        subB.j = 12;
        subB.k = 15;

        subB.showOnlyIJ();
        subB.showOnlyK();
        System.out.println();

       subB.sumOfAll();

    }
}
