package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
//        String str = "Welcome";
        Map<Integer,String> newMap= new HashMap<Integer,String>();
        newMap.put(1,"W");
        newMap.put(2,"e");
        newMap.put(3,"l");
        newMap.put(4,"c");
        newMap.put(5,"o");
        newMap.put(6,"m");
        newMap.put(7,"e");

        Iterator<Map.Entry<Integer,String>>itr = newMap.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }


}
