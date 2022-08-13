package homeWork.home_work_1.service.impl;

import homeWork.home_work_1.model.Student;
import homeWork.home_work_1.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> students = new ArrayList<>();

    @Override
    public void addStudent() {
        Student student = this.infoStudent();
        students.add(student);
        System.out.println("OK");
    }

    @Override
    public void dispayListStudent() {
        for (Student student: students){
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() {
    Student student = this.findStudent();
    if (student == null){
        System.out.println("không tìm thấy đối tượng cần xóa");
    }else {
        System.out.println("bạn có muốn xóa đối tượng là " +student.getId()+"không >");
    }
    }
    public Student findStudent(){
        System.out.println("Mời bạn nhập vào id cần xóa");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId() == id){
                return students.get(i);
            }
        }
        return null ;
    }

    public Student infoStudent() {
        System.out.println("Nhập vào id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tên của bạn");
        String name = sc.nextLine();
        System.out.println("Nhập vào ngày sinh của bạn");
        String birthDay = sc.nextLine();
        System.out.println("Nhập vào giới tính của bạn");
        boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập vào điểm của bạn");
        int pointStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tên lớp");
        String classStudent = sc.nextLine();
        Student student = new Student(id,name,birthDay,sex,classStudent,pointStudent);
        return student;
    }
}
