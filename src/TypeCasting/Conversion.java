package TypeCasting;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 256;
        double d = 323.142;
        System.out.println("Conversion of int to bytes");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);
        System.out.println("Conversion of double to int");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("Conversion of double to byte");
        b = (byte) d;
        System.out.println("b and d " + b + " " + d);

        // Error
//        byte x = 50;
//        x = x * 2;
    }
}
