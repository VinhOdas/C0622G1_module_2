package homeWork.home_work_1.controller;

import homeWork.home_work_1.service.IStudentService;
import homeWork.home_work_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = new StudentService();
    public void menu(){
        while (true){
            System.out.println("-----------------------------");
            System.out.println("Chào mừng bạn đến với lớp C0622G1");
            System.out.println("1.Hiển thị danh sách học viên");
            System.out.println("2.Thêm mới học viên");
            System.out.println("3.Cập nhật thông tin học viên");
            System.out.println("4.Xóa học viên");
            System.out.println("5.Thoát");
            System.out.println("Mời bạn nhập chức nawng1->5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    studentService.dispayListStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:

                    break;
                case 4:
                    studentService.removeStudent();
                    break;
                case 5:
                    return;
                default:
            }

        }
    }

}
