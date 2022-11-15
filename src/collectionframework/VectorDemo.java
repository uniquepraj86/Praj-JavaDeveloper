package collectionframework;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector <Integer> List = new Vector<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);

        for(int i = 0; i < List.size(); i++){
            System.out.println(List.get(3));
        }

        System.out.println(List);
        System.out.println(List.capacity());
        System.out.println(List.firstElement());
        System.out.println(List.lastElement());
        System.out.println(List.isEmpty());
        System.out.println(List.subList(1,3));


    }
}
