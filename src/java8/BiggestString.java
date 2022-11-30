package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BiggestString {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("Prajakta");
        str.add("Akole");
        str.add("Ahmednagar");
        str.add("Maharashtra");
        str.add("India");
        System.out.println(str);
        String longestString = str.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);

        int lengthString = str.stream().map(String::length).max(Integer::compare).get();
        System.out.println(lengthString);


    }


    }

