package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String>gameList = new ArrayList<>();
        gameList.add("Football");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hockey");
        System.out.println(".......Lambda expression ..........");
        gameList.forEach(games-> System.out.println(games));
        System.out.println("....... Method reference..........");
        gameList.forEach(System.out::println);

    }
}
