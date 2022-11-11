package collectionframework;
// LinkList Store Duplicate Value
// Maintain insertion order
// use to doubly linked list to store the element.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        List<Integer> list2=new LinkedList<>();
        list1.add(1);
        list1.add(6);
        list1.add(7);
        list1.add(2);

//        System.out.println(list2);

        System.out.println(list1.addAll(list2));
        System.out.println(list1);
        System.out.println(list1.removeAll(list2));
        System.out.println(list1);
        System.out.println(list1.retainAll(list2));
        System.out.println(list1);
    }
}
