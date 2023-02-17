package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Write a code to print duplicate employee name count from employee Example?
 */

public class Employee2 {

    String id;
    String name;
    String dept;
    int age;

    public Employee2(String String, String name, String dept, int age) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        List<Employee2> emplist = new ArrayList<>();
        emplist.add(new Employee2("E40001","pradeep","H.R",36));
        emplist.add(new Employee2("E40002","Ashok","Manager",26));
        emplist.add(new Employee2("E40003","Ashok","Manager",30));
        emplist.add(new Employee2("E40003","pradeep","ASST Manager",26));
        emplist.add(new Employee2("E40002","Santosh","Store Manager",32));

       Map<String,Long> nameCount = emplist.stream().collect(Collectors.
               groupingBy(Employee2 :: getName,Collectors.counting()));
             System.out.println(nameCount);

             //loop
        Map<String,Integer> map = new HashMap<String,Integer>();
         for(Employee2 e:emplist)
         {
             if(!map.containsKey(e.getName())){

             }

         }
    }

}
