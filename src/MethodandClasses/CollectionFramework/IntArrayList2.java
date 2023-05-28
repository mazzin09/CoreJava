package MethodandClasses.CollectionFramework;

import java.util.Scanner;

public class IntArrayList2 {
//    int[] a = new int[5];
    int[] a = {0,1,2,3,4};

    public boolean add(){
        int index = 0;
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements you want to enter: ");
        int element = scanner.nextInt();
        System.out.println("Elements: " + element);
        //Creating new array
        int[] b = new int[a.length + element];
        //inserting a[] array into b[] array
        for (int i = 0; i < a.length; i ++){
            b[i] = a[j];
            j++;
        }
        //inserting elements into b [] array
        index = a.length;
        for (int i = index;i < b.length;i ++){
            b[i] = scanner.nextInt();
        }
        //printing out the output
        System.out.println("After Adding any element");
        for (int i = 0; i < b.length; i ++){
            System.out.println(b[i]);
        }
        return true;
    }

    public int get(int index){
        return 1;
    }


    public static void main(String[] args) {
        IntArrayList2 dynamic = new IntArrayList2();
        dynamic.add();
    }
}
