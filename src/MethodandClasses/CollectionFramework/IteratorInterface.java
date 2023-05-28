//package MethodandClasses.CollectionFramework;
//
//import java.util.ArrayList;
//import java.util.List;
//
//interface IteratorNew{
//    boolean hasNext();
//    int next();
//}
//public class IteratorInterface implements IteratorNew{
//    class NewArrayList2 {
//        int[] a = new int[5];
//        int count = 0;
//        //    int b[];
//        int b[] = new int[a.length + count];
//
//        int indexTrack = a.length;
//
//        public boolean add(int element){
////        System.out.println(a.length);
//            if(count >= a.length){
//                int b[] = new int[a.length + count];
//                for (int i = 0; i < a.length; i ++){
//                    b[i] = a[i];
//                }
//                a = b ;
//            }
//            a[count] = element;
//            count++;
//            return true;
//        }
//
//    }
//    private int currentIndex;
//    private List list;
//
//    public IteratorNew iteratorNew(){
//
//    }
//    @Override
//    public boolean hasNext() {
//        return currentIndex < list.size();
//    }
//
//    @Override
//    public int next() {
//        int element =(int) list.get(currentIndex);
//        currentIndex++;
//        return element;
//    }
//
//
//    public static void main(String[] args) {
//        NewArrayList2 al = new NewArrayList2();
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//
//        IteratorInterface iterator = new IteratorInterface(al);
//        while (iterator.hasNext()){
//            int element = iterator.next();
//            System.out.println(element);
//        }
//
//    }
//}
//
//
//
//
//
//
//
//
