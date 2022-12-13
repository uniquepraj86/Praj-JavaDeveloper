package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class sortDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,32,53,46,15);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
