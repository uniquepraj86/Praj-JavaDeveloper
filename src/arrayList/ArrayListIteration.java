package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        System.out.println("===Using iterator===");
        Iterator itr = movies.iterator();
        while (itr.hasNext()){
            String movie = (String)itr.next();
            System.out.println("movie="+movie);
        }
        System.out.println("Using for each ");
        for(String s :movies){
            System.out.println(s);
        }
        System.out.println("Using java8 ");
        movies.stream().forEach(System.out::println);

    }
}
