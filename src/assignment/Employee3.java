package assignment;

import collectionframework.Employee;

import java.util.*;
import java.util.stream.Collectors;

/**
 * {EmpId,name,department,age}
 */


public class Employee3 {

    String id;
    String name;
    String department;
    int age;

    public Employee3(String string, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Employee3> emp = new LinkedList<>();
        emp.add(new Employee3("E001", "Pooja", "Manager", 23));
        emp.add(new Employee3("E001", "Pooja", "H.R", 26));
        emp.add(new Employee3("E001", "Rakesh", "Manager", 29));
        emp.add(new Employee3("E001", "Jivika", "H.R", 32));
        emp.add(new Employee3("E001", "Vaibhav", "Developer", 21));
        emp.add(new Employee3("E001", "Rakesh", "H.R", 21));
        emp.add(new Employee3("E001", "Jivika", "Developer", 23));
        emp.add(new Employee3("E001", "pooja", "Manager", 32));


        Map<String, Long> name = emp.stream().collect(Collectors.
                groupingBy(Employee3::getDepartment, Collectors.counting()));
        System.out.println(name);

//        //loop
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        for(Employee3 e : emp){
//            if(!map.containsValue(e.getName())){
//                System.out.println(e);
//            }


    }

}
