package assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DuplicateNo {
    public static void main(String[] args) {
      //  Set<Integer> set = new HashSet<>();
//        set.add(50);
//        set.add(30);
//        set.add(34);
//        set.add(30);
//        set.add(50);
//        set.add(3);
//        set.add(10);
//        set.add(4);
//        set.add(4);
//        System.out.println(set);

        List<String> duplicates = Arrays.asList("AB", "BA", "AB", "AC", "ACD", "ACD", "Z", "E", "E");
        Set set=new HashSet();
        for (String s:duplicates){
             if(!set.add(s))
       {
         System.out.println(s);
       }
        }

    }
}
