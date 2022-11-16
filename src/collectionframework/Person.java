package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private int id;
    private String name;
    private  int Age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return id == person.id && Age == person.Age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, Age);
//    }

    public static void main(String[] args) {
        Set<Person> personList =new HashSet<>();
        Person p1 = new Person(1,"praj",24);
        Person p2 = new Person(1,"praj",24);
        Person p3 = new Person(1,"praj",24);
       personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.forEach(Person->{
            System.out.println("Id: "+ Person.id+ " Name: "+Person.name+" Marks: "+Person.Age);
        });

    }
}
