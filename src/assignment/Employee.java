package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    int empId;
    String empName;
    String empAddress;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Employee(int empId, String empName, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                empName.equals(employee.empName) &&
                empAddress.equals(employee.empAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empAddress);
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"John","street 1,"));
        employees.add(new Employee(2,"Frank","Nr. Cosmos,"));
        employees.add(new Employee(3,"Danyy","street 101,Washington DC,"));
        employees.add(new Employee(1,"John","street 1,"));
        employees.add(new Employee(2,"Frank","Nr. Cosmos,"));
        employees.stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1L)
                .map(Map.Entry::getKey).toList()
                .forEach(employee -> System.out.println(employee.getEmpId()+"==>"+employee.getEmpName()));
    }
}
