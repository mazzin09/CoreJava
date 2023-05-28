package MethodandClasses.CollectionFramework.Custom;

import java.util.Iterator;
import java.util.ListIterator;

public class NewArrayList{
    int[] a = new int[5];
    int count = 0;

    int b[] = new int[a.length + count];

    int indexTrack;

    private int currentIndex = 0;

    class CustomIteration implements Iterator, ListIterator {

        @Override
        public boolean hasNext() {
            return currentIndex < count;

        }

        @Override
        public Object next() {
            int element =(int) a[currentIndex];
            currentIndex++;
            return element;
        }

        @Override
        public boolean hasPrevious() {
            return indexTrack >= 0;
        }

        @Override
        public Object previous() {
            int listElement = (int) a[indexTrack];
            indexTrack--;
            return listElement;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Object o) {

        }

        @Override
        public void add(Object o) {

        }
    }
    public CustomIteration iteration(){
        return new CustomIteration();
    }

    public CustomIteration listIteration(){
        return new CustomIteration();
    }

    public boolean add(int element){
        if(count >= a.length){
            int b[] = new int[a.length + count];
            for (int i = 0; i < a.length; i ++){
                b[i] = a[i];
            }
            a = b ;
        }
        a[count] = element;
        count++;
        indexTrack = count-1;
        return true;
    }

    public boolean remove(int element){
        boolean check = false;
        for(int r: a){
            if(r == element){
                int b[] = new int[a.length - 1];
                for (int i = 0,k = 0; i < a.length; i ++){
                    if(a[i] != element ){
                        b[k] = a[i];
                        k++;
                    }
                }
                a = b ;
                count--;
                check = true;
                break;
            }
            else{
                check = false;
            }
        }
        return check;
    }


    public static void main(String[] args) {
        NewArrayList newAl = new NewArrayList();
        newAl.add(3);
        newAl.add(2);
        newAl.add(1);
        newAl.add(4);
        newAl.add(5);
        newAl.add(8);
//        newAl.remove(8);
//        newAl.remove(5);

        CustomIteration iteration1 = newAl.iteration();
        while (iteration1.hasNext()){
            System.out.println(iteration1.next());
        }
        System.out.println("----------------------------------------------");
        CustomIteration iteration2 = newAl.listIteration();

        while (iteration2.hasPrevious()){
           Integer elements = (Integer) iteration2.previous();
            System.out.println(elements);

        }
    }
}
