package java8;


import java.util.*;
import java.util.function.Predicate;

public class Employee1 {
    int id;
    String name;
    Double salary;

    public Employee1(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "Employee1{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
    }

    public Double getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();
        Employee1 p1 = new Employee1(1, "Prakrit", 10000.0);
        Employee1 p2 = new Employee1(2, "Shivani", 24000.0);
        Employee1 p3 = new Employee1(3, "A", 9000.0);
        empList.add(p1);
        empList.add(p2);
        empList.add(p3);

        Predicate<Employee1> employee1Predicate = employee1 -> employee1.getSalary() > 10000;
        empList.stream().filter(employee1Predicate).forEach(System.out::println);

    }
}
