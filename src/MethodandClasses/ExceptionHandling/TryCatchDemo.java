package MethodandClasses.ExceptionHandling;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            int a = 100;
            int b = 0;
            int c = a/b;
            System.out.println("Print the result: " + c);
        }
        catch (Exception e){
            System.out.println("ArthimeticException: " + e.getMessage());
        }
    }
}
