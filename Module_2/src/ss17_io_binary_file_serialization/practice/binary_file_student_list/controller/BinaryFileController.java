package ss17_io_binary_file_serialization.practice.binary_file_student_list.controller;

import ss17_io_binary_file_serialization.practice.binary_file_student_list.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFileController {
    private static final String path_File ="students.txt";
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(students);
            oout.close();
            fout.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public static List<Student> readToFile(String pathRead) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fiot = new FileInputStream(pathRead);
            ObjectInputStream oiut = new ObjectInputStream(fiot);
            students = (List<Student>) oiut.readObject();
            fiot.close();
            oiut.close();
        } catch (IOException | ClassNotFoundException e) {
        }
        return students;
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Phạm Quang Vinh", "Quảng Bình"));
        students.add(new Student(2, "Phạm Quang Vinh", "Quảng Bình"));
        students.add(new Student(3, "Phạm Quang Vinh", "Quảng Bình"));
        writeToFile(path_File, students);
        List<Student> reStudentList = readToFile(path_File);
        for (Student student: reStudentList) {
            System.out.println(student);
        }
    }
}
