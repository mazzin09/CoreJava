package MethodandClasses.OOP;

class SupClass{
    String dis;
    SupClass(String s){
        this.dis = "ab";
        System.out.println("Super Constructor called");
    }
}

class SubClass extends SupClass{
    SubClass(){
        super("hey");
        System.out.println("Sub constructor called");
    }
}

public class TestShow {
    public static void main(String[] args) {
        new SubClass();
    }
}
