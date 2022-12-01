package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BiggestString {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("Prajakta");
        str.add("Akole");
        str.add("Ahmednagar");
        str.add("Maharashtra");
        str.add("Mahareshtra");
        str.add("India");

        System.out.println("************************************************");

        System.out.println(str);

        System.out.println("************************************************");
        String longestString = str.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestString);



        System.out.println("*********************(1)*********************************");

        int lengthString = str.stream().map(String::length).max(Integer::compare).get();
        System.out.println(lengthString);

        System.out.println("***********************(2)*******************************8");

        str.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

        System.out.println("**********************(3)******************************");
        str.stream()
                .map(n -> n.toLowerCase())
                .sorted(Comparator.comparingInt(String::length))
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .forEachOrdered(n -> System.out.println(n));

        System.out.println("**************************(4)*********************************");

        str.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                .sorted(Comparator.comparingInt(String::length))
                .forEach(n-> System.out.println(n));

        System.out.println("***********************(5)******************************");
        System.out.println("");

        List<String> list = Arrays.asList("SOmE", "StriNgs", "fRom", "mE", "To", "yOU");
        list.stream()
                .map(n -> n.toLowerCase())
                .sorted((a, b) -> a.length() - b.length())
                .forEach(n -> System.out.println(n));
        System.out.println("************************************************************");
        list.stream()
                .map(n -> n.toLowerCase())
                .sorted(Comparator.comparingInt(String::length))
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .forEachOrdered(n -> System.out.println(n));
    }


    }

