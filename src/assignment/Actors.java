package assignment;

import java.util.*;

public class Actors {
    public static void main(String[] args)
    {
//      List list = Arrays.asList("Robort DJr  Chris Scarlett Benedict Jack-man BrieLarson GalGodot Hems worth Paul");
        List <String> list = new ArrayList<>();
        list.add("Robort DJr");
        list.add("Chris");
        list.add("Scarletr");
        list.add("Bendict");
        list.add("Jack-Man");
        list.add("Brielarson");
        list.add("GalGodot");
        list.add("Hems worth");
        list.add("Paul");

        Collections.rotate(list,5);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.rotate(list,3);
        System.out.println(list);

    }
}
