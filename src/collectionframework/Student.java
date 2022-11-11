package collectionframework;



import java.util.ArrayList;

import java.util.List;

public class Student implements Comparable<Student>
{
     String name;
    Integer id;
    Integer age;

    public Student (String name,Integer id,Integer age){
        this.name = name;
        this.id = id;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student p) {
        System.out.println("age" +age);
        System.out.println("p.age"+p.age);
        return id.compareTo(p.id);
    }
    public String toString(){
        return "Student{"+
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class StudentImpl{
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student p1 = new Student("Praj",1,23);
        Student p2 = new Student("Ruth",2,22);
        Student p3 = new Student("Avani",3,21);
        studentList.add(p1);
        studentList.add(p2);
        studentList.add(p3);
        System.out.println(studentList);
//        Collections.sort(personList);
        for(Student student:studentList){
            System.out.println(student);
        }
    }
}



