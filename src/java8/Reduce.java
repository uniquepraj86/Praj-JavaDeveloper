package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Reduce {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("sara","shakti","sam","sunil");
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);

        Optional<String> newString = l.stream().reduce((f, s)-> f.length() < s.length()? f : s);
        newString.ifPresent(System.out::println);


           Optional<Integer> NewString1 = l1.stream().reduce((a, b)->a+b);
                  System.out.println(NewString1.get());

    }
}
