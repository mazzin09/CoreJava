package MethodandClasses.OOP;

class First{
    int i,j;
    First(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println("Value of i and j : " + i + " " + j);
    }
}

class Second extends First{
    int k;
    Second(int a, int b, int c){
        super(a,b);
        k = c;
    }

    void show(){
        super.show(); // to show override method of superclass.
        System.out.println("Value of K only: " + k);
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Second s1 = new Second(13,21,45);
        s1.show();
    }
}
