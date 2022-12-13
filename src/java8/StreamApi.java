package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *  stream api - > it is sequence of object and have many methods,and combine that method to produce desire result
 * parallel and sequential
 *  operation ->
 *  1 . terminal operation - forEach(Consumer) , reduce(), collect()
 *  2 . intermediate operation - map(Function) ,filter(Predicate), sorted()
 */
public class StreamApi {
    public static void main(String[] args) {
//        List<Integer> L = Arrays.asList(1,2,3,4,5);
        Function<Integer,Integer> fun = (integer -> 8*93);
        System.out.println(fun.apply(9));

        Function<String,Integer> str = (st)->st.length();
        System.out.println(str.apply("Welcome-India"));


        Function <String,Integer> s = (st)-> st.length();
        Function <String,Integer> s1 = (st1)-> st1.length();


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9).max().getAsInt());
        System.out.println(Arrays.toString(IntStream.range(1,100).toArray()));
        System.out.println(IntStream.range(1,11).sum());

        Predicate<Integer>  max = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>5;
            }
        };

        list.stream().filter(max).forEach(System.out::println);


        System.out.println("**************************************************");


        List<Integer> lists = new ArrayList<>(Arrays.asList(4,12,19,10,90,30,60,17,90));
        System.out.println(lists.stream().max(Comparator.naturalOrder()).get());

    }
}
