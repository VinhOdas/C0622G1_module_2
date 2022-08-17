package homeWork.home_work_1.service.impl;

import homeWork.home_work_1.model.Teacher;
import homeWork.home_work_1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teachers = new ArrayList<>();

    static {
        teachers.add(new Teacher(1, "vinh", "17/11/1999", "true", "hóa"));
        teachers.add(new Teacher(2, "vinh1", "17/11/1999", "true", "hóa"));
        teachers.add(new Teacher(3, "vinh2", "17/11/1999", "false", "hóa"));

    }

    @Override
    public void displayListTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void addTeacher() {
        Teacher teacher = this.infoTeacher();
        teachers.add(teacher);
        System.out.println("Bạn đã add thành công");
    }

    public TeacherService() {
        super();
    }

    @Override
    public void updateTeacher() {
        Teacher teacherUpdate = this.findTeacher();
        if (teacherUpdate == null) {
            System.out.println("Không có");
        } else {
            System.out.println("Chọn 1 nếu bạn muốn thay đổi" +
                    "\n 1. Mã giảng viên" +
                    "\n    Tên giảng viên" +
                    "\n  ngày tháng năm sinh" +
                    "\n  giới tính" +
                    "\n  chuyên môn ");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("bạn muốn thay đổi id thành: ");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    teacherUpdate.setId(idUpdate);
                    System.out.println("bạn muốn thay đổi tên thành: ");
                    String nameUpdate = scanner.nextLine();
                    System.out.println("bạn muốn thay đổi ngày sinh thành: ");
                    String birthDayUpdate = scanner.nextLine();
                    System.out.println("bạn muốn thay đổi giới tính thành: ");
                    boolean genderUpdate = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("bạn muốn thay đổi chuyên môn thành: ");
                    String specialize = scanner.nextLine();
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
    public void removeTeacher() {
        Teacher teacher = this.findTeacher();
        if (teacher != null) {
            System.out.println("Bạn có muốn xóa đối tượng này không" +
                    "\n1. Có" +
                    "\n2. Không");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    teachers.remove(teacher);
                    break;
                case 2:
                    System.out.println("sai");
                    break;
            }
        } else {
            System.out.println();
        }

    }

    public Teacher findTeacher() {
        System.out.println("Mời bạn nhập vào id ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id) {
                return teachers.get(i);
            }
        }
        return null;
    }

    @Override
    public void searchTeacher() {
        Teacher teacher = this.findTeacher();
        
    }

    public Teacher infoTeacher() {
        System.out.println("Nhập vào id");
        int id = Integer.parseInt(scanner.nextLine());
        int count =0;
        do {

            for (int i = 0; i < teachers.size(); i++) {
                if (teachers.get(i).getId() == id) {
                    count++;
                    System.out.println("sai");
                    break;
                }
            }
        } while (count != 0);

        System.out.println("Nhập vào tên giàng viên");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày tháng năm sinh của giảng viên");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập vào giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào chuyên môn của giảng viên");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, birthDay, gender, specialize);
        return teacher;

    }

}
