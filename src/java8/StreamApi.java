package java8;

import java.util.function.Function;

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
    }
}
