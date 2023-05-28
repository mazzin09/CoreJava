package MethodandClasses.CollectionFramework.Custom;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NewArrayList2 implements List {
    int[] a = new int[5];
    int count = 0;

    int b[] = new int[a.length + count];

    int indexTrack;

    private int currentIndex = 0;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object element) {
        if(count >= a.length){
            int b[] = new int[a.length + 1];
            for (int i = 0; i < a.length; i ++){
                b[i] = a[i];
            }
            a = b ;
        }
        a[count] = (int) element;
        count++;
        indexTrack = count-1;
        return true;
    }

    @Override
    public boolean remove(Object element) {
        boolean check = false;
        for(int r: a){
            if(r == (int) element){
                int b[] = new int[a.length - 1];
                for (int i = 0,k = 0; i < a.length; i ++){
                    if(a[i] != (int) element ){
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

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return a[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    public static void main(String[] args) {
        NewArrayList2 newArraylist = new NewArrayList2();
        newArraylist.add(10);
        newArraylist.add(20);
        newArraylist.add(30);
        newArraylist.add(40);
        newArraylist.add(50);
        newArraylist.add(60);
        Object obj = 10;
        Object obj1 = 20;
//        newArraylist.remove(obj);
//        System.out.println(newArraylist.get(1));
//        newArraylist.remove(obj1);


    }
}
