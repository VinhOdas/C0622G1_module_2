package ss12_java_collection_framework.pratice.hashmap_and_hashset.controller;

import ss12_java_collection_framework.pratice.hashmap_and_hashset.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentController {
    public static void main(String[] args) {
        Student student1 = new Student("vinh",25,"quang binh");
        Student student2 = new Student("vinh1",25,"quang binh");
        Student student3 = new Student("vinh2",25,"quang binh");
        Map<Integer,Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        for (Map.Entry<Integer,Student> studentEntry: studentMap.entrySet() ) {
            System.out.println(studentEntry.toString());
        }

    }
}
