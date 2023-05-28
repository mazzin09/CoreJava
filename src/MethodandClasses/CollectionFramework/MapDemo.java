package MethodandClasses.CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(101);
        al.add(102);
        al.add(103);

        System.out.println(al);

        Map map = new HashMap();

        map.put(100, "Roman");
        map.put(101, "Dave");
        map.put(102, "Mario");
        map.put(103, "Mario");

        //Null values
        map.put(null, null);
        map.put(104, null);

        System.out.println(map);

    }
}
