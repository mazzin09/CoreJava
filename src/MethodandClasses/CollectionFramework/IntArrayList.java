    package MethodandClasses.CollectionFramework;


    import java.util.ArrayList;
    import java.util.Scanner;

    public class IntArrayList {
        int[] a = new int[5];
        int[] b;

        Scanner scanElement = new Scanner(System.in);

        public boolean arrayEmpty(){
            boolean isEmpty = true;
            for (int i = 0; i < a.length; i ++){
                if (a[i] != 0){
                    isEmpty = false;
                    break;
                }
                else{
                    return true;
                }
            }
            return isEmpty;
        }

        public int printPreviousArray(){
            for (int i = 0; i < a.length; i ++){
                System.out.println(a[i]);
            }
            return 1;
        }

        public int printNextArray(){
            for (int i = 0; i < b.length; i ++){
                System.out.println(b[i]);
            }
            return 1;
        }

        public int copyArray(){
            int j = 0;
            for (int i = 0; i < a.length; i ++){
                b[i] = a[j];
                j++;
            }
            return 1;
        }
        public int fillArray(int element){
            int indexAdd = element - a.length;
            if(indexAdd <= 0){
                for (int i = 0; i < element; i ++){
                    a[i] = scanElement.nextInt();
                }
                return printPreviousArray();
            }
            else{
                b = new int[a.length + indexAdd];
                for (int i = 0; i < b.length; i ++){
                    b[i] = scanElement.nextInt();
                }
               return printNextArray();
            }
        }
        public int growArray(int element){
            Scanner scanElement = new Scanner(System.in);
            b = new int[a.length + element];
            copyArray();
            for (int i = a.length;i < b.length;i++){
                b[i] = scanElement.nextInt();
            }
            return printNextArray();
        }

        public boolean add(int element){
            if (arrayEmpty()){
                fillArray(element);
            }
            else{
                growArray(element);
            }
            return true;
        }

        public int get(int index){
            return 1;
        }
        public static void main(String[] args) {
            IntArrayList iA = new IntArrayList();
            iA.add(3);
            iA.add(3);
            iA.add(3);
            iA.add(3);
            iA.add(3);
            iA.add(3);
        }
    }
