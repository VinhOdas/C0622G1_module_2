package homeWork.home_work_1.service.impl;

import homeWork.home_work_1.model.Student;
import homeWork.home_work_1.model.Teacher;
import homeWork.home_work_1.service.IStudentService;
import ss7_abstract_class_interface.practice.interface_comparable.model.Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> students = new ArrayList<>();
    public static List<Student> students1 = new ArrayList<>();


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

    @Override
    public void displayStudentOptional() {
        System.out.println("Nhập lựa chọn của bạn");
        int choise = Integer.parseInt(sc.nextLine());

    }
    public void displayScoreStudent(){
        System.out.println("Nhập điểm muốn sắp xếp");
        int scoreStudent = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <students.size() ; i++) {
            if (students.get(i).getId() > scoreStudent){
                System.out.println(students.toString());
            }
        }
    }

    @Override
    public void updateStudent() {
        Student studentUpdate = this.findStudent();
        if (studentUpdate == null) {
            System.out.println("Không có");
        } else {
            System.out.println("Chọn 1 nếu bạn muốn thay đổi" +
                    "\n 1. Mã học viên" +
                    "\n    Tên học viên" +
                    "\n  ngày tháng năm sinh" +
                    "\n  giới tính" +
                    "\n  điểm" +
                    "\n lớp ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("bạn muốn thay đổi id thành: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    studentUpdate.setId(idUpdate);
                    System.out.println("bạn muốn thay đổi tên thành: ");
                    String nameUpdate = sc.nextLine();
                    System.out.println("bạn muốn thay đổi ngày sinh thành: ");
                    String birthDayUpdate = sc.nextLine();
                    System.out.println("bạn muốn thay đổi giới tính thành: ");
                    boolean genderUpdate = Boolean.parseBoolean(sc.nextLine());
                    System.out.println("bạn muốn thay đổi lớp thành: ");
                    String classStudent = sc.nextLine();
                    System.out.println("bạn muốn thay đổi điểm thành: ");
                    int scoreStudent = Integer.parseInt(sc.nextLine());
                    System.out.println("bạn đã thay đổi thành công");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
        }
    }

    @Override
    public void searchIdStudent() {
        Student student = this.findStudent();
        System.out.println("sản phẩm muốn tìm là" + student.toString());
    }

    @Override
    public void searchNameStudent() {
        System.out.println("nhập vào tên muốn tìm");
        String nameTeacherSearch = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(nameTeacherSearch)) {
                System.out.println("danh sách học viên bạn đang tìm là: " + students.get(i).toString());
            }

        }
    }

    public Student infoStudent() {
        int id;
        int count =0;
        do {  System.out.println("Nhập vào id");
            id = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getId() == id) {
                    count++;
                    System.out.println("sai");
                    break;
                }
            }
        } while (count != 0);
        System.out.println("Nhập vào tên học viên");
        String name = sc.nextLine();
        System.out.println("Nhập vào ngày sinh của học viên");
        String birthDay = sc.nextLine();
        System.out.println("Nhập vào giới tính của học viên");
        String  gender = sc.nextLine();
        System.out.println("Nhập vào điểm của học viên");
        int pointStudent = Integer.parseInt(sc.nextLine());
        System.out.println("Mời học viên nhập tên lớp");
        String classStudent = sc.nextLine();
        Student student = new Student(id,name,birthDay,gender,classStudent,pointStudent);
        return student;
    }
}
