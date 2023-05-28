package MethodandClasses.MetaData;

public class AutoBoxDemo {

    static int m(Integer v){
        return v/2;
    }

    public static void main(String[] args) {
        Integer iA = m(100);
        System.out.println(iA);
//        Integer iA  = 100;
//        int i = iA;
//        System.out.println(i + " " + iA);
    }
}
