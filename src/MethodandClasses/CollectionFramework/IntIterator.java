package MethodandClasses.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IntIterator {
    private ArrayList al;
    private int currentIndex;

    public IntIterator(ArrayList al ){
        this.al = al;
        this.currentIndex = 0;
    }
    public boolean hasNext(){
        return currentIndex < al.size();
    }

    public int next(){
        int element =(int) al.get(currentIndex);
        currentIndex++;
        return element;
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        IntIterator iterator = new IntIterator(al);
        boolean result = iterator.hasNext(); //question
        while (iterator.hasNext()){
            int element = iterator.next();
            System.out.println(element);
        }
    }
}
