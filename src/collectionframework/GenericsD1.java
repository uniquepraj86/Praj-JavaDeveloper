package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class GenericsD1 <T>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
//        List<String> Alist = new ArrayList<>();
//        Alist.add("Reshma");
//        System.out.println(Alist);



        List list = new ArrayList<>();
        list.add("r");

        String s = (String) list.get(0);
        System.out.println();
    }
}
