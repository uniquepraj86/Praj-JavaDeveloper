package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class Employee {
     Integer id;
     String Name;
     String Address;

    public Employee(Integer id, String Name, String Address) {
        this.id = id;
        this.Name = Name;
        this.Address = Address;

    }

    public static void main(String[] args) {
        List <Employee>employeeList = new LinkedList<>();
        Employee s1 = new Employee(1, "Praj", "Pune");
        Employee s2 = new Employee(2, "Pranali", "Mumbai");
        Employee s3 = new Employee(3, "Janahvi", "goa");
        employeeList.add(s1);
        employeeList.add(s2);
        employeeList.add(s3);
//
//

        employeeList.forEach(Employee->{
            System.out.println("Id: "+ Employee.id+ " Name: "+Employee.Name+" Address: "+Employee.Address);
        });


    }
}
