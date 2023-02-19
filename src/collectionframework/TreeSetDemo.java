package collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(93);
        treeSet.add(15);
        treeSet.add(16);
        treeSet.add(19);
        treeSet.add(43);
        treeSet.add(43);
        System.out.println(treeSet);
        System.out.println(treeSet.headSet(19,true));
        System.out.println(treeSet.tailSet(19,true));
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.first());
        System.out.println(treeSet.floor(15));
        System.out.println(treeSet.higher(43));
        System.out.println(treeSet.descendingSet());
    }
}
