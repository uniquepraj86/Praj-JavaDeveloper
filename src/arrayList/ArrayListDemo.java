package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //creation of ArrayList
        ArrayList al=new ArrayList();
        System.out.println("initial size of the arraylist:"+al.size());
        al.add("a");
        al.add("A");
        al.add("a");
        al.add(null);
        al.add(10);
        al.add(1,"rattan");
        System.out.println(al);
        System.out.println("ArrayList size:"+al.size());
        al.remove("a");
        System.out.println("ArrayList size:"+al.size());
        System.out.println(al);

    }
}
