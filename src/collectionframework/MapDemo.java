package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();   // integer value   and key String
        map.put(1,"Nashik");
        map.put(2,"pune");
        map.put(3,"Delhi");
        System.out.println(map);
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.hashCode());


        map.forEach((v,k)->{
            System.out.println(v+" = "+k);
        });

        for (Map.Entry<Integer, String> m:map.entrySet()){
            System.out.println(m.getValue()+" = "+m.getKey());
        }

    }
}
