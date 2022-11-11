package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// ArrayList - store duplicate value
//             maintain insertion order
//             it grow or shrink automatically

public class ArrayListDemo {
    public static  void main(String[] args) {

        List<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        List<Integer>list2=new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(6);
        list2.add(4);
        System.out.println(list1.addAll(list2));
        System.out.println(list1);
        System.out.println(list1.removeAll(list2));
        System.out.println(list1);
        System.out.println(list1.retainAll(list2));
//        System.out.println(list1);
//        System.out.println(list1.remove(2));
        System.out.println(list1.contains(0));
        list1.clear();
        System.out.println(list1);
        System.out.println(list1.stream().iterator());


        List<Integer>list = new ArrayList<>();
        List<Integer>list4 = Arrays.asList(2,3,4,5);
        System.out.println(list4);
        List<Integer>list5 = new ArrayList<>(Arrays.asList(9,7,8,5));
        System.out.println(list5);
        List<Integer>list6 = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(list6);



    }
}
