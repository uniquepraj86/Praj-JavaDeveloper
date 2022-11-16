package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("p");
        set.add("q");
        set.add("r");
        set.add("s");
        set.add("t");
        set.add("u");
        set.add("v");

        System.out.println(set);
        System.out.println(set.contains("p"));  // it returns present or not
        System.out.println(set.remove("r"));



    }
}

