package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeesDemo implements Comparable {
    int id;
    String name;
    String address;

    public EmployeesDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        List<EmployeesDemo> List = new ArrayList<>();
        EmployeesDemo p1 = new EmployeesDemo(1,"k","pune");
        EmployeesDemo p2 = new EmployeesDemo(2,"r","kotul");
        EmployeesDemo p3 = new EmployeesDemo(3,"praj","goa");
        List.add(p1);
        List.add(p2);
        List.add(p3);
        System.out.println(List);
        Collections.sort(List);
        for(EmployeesDemo employeesDemo:List){
            System.out.println(List);
        }
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

//    @Override
//    public int compareTo(EmployeesDemo o) {
//        return this.name.compareTo(o.name);
//
//        }
//
//    @Override
//    public int compareTo(EmployeesDemo o) {
//        return this.name.compareTo(o.name);
    }


