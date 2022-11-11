package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Student1 {
        Integer id;
        String name;
        Integer marks;

        public Student1(Integer id, String name, Integer marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        public static void main(String[] args) {
            List<Student1>student1List = new ArrayList<>();
            Student1 s1 =new Student1(1,"Ruth",85);
            Student1 s2 =new Student1(2,"David",89);
            Student1 s3 =new Student1(3,"Madhuri",97);
            student1List.add(s1);
            student1List.add(s2);
            student1List.add(s3);
            student1List.forEach(Student1->{
                System.out.println("Id: "+ Student1.id+ " Name: "+Student1.name+" Marks: "+Student1.marks);
            });

        }
    }
