package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> list =new TreeMap<>();
        list.put(1,10);
        list.put(2,20);
        list.put(3,30);
        list.put(4,40);
        list.put(5,50);
        list.put(6,60);
        System.out.println(list.descendingKeySet());
        System.out.println(list.entrySet());
        System.out.println(list.firstEntry());
        System.out.println(list.subMap(2,4));
        System.out.println(list.comparator());
        System.out.println(list.ceilingEntry(60 ));
    }
}
