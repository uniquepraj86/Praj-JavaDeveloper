package collectionframework;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        List<Map> MapList = new LinkedList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nashik");
        map.put(2, "pune");
        map.put(3, "Delhi");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Nashik");
        map1.put(2, "pune");
        map1.put(3, "Delhi");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Nashik");
        map2.put(2, "pune");
        map2.put(3, "Delhi");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "Nashik");
        map3.put(2, "pune");
        map3.put(3, "Delhi");


        MapList.add(map);
        MapList.add(map1);
        MapList.add(map2);
        MapList.add(map3);


        MapList.forEach((List) -> {

            map.forEach((v, k) -> {
                System.out.println(v + " = " + k);
            });
        });
    }
}
