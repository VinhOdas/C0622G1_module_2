package homeWork.home_work_1.controller;

import homeWork.home_work_1.service.IStudentService;
import homeWork.home_work_1.service.ITeacherService;
import homeWork.home_work_1.service.impl.StudentService;
import homeWork.home_work_1.service.impl.TeacherService;

import java.util.Scanner;

public class PersonController {
    private Scanner scanner = new Scanner(System.in);
    private static final IStudentService studentService = new StudentService();
    private static final ITeacherService teacherService = new TeacherService();

    public void menu() {
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("Chào mừng bạn đến với lớp C0622G1");
            System.out.println("1. Lựa chọn học viên" +
                                "\n 2. Lựa chọn giảng viên" +
                                "\n 3.Exit");
//            System.out.println("1.Hiển thị danh sách học viên");
//            System.out.println("2.Thêm mới học viên");
//            System.out.println("3.Cập nhật thông tin học viên");
//            System.out.println("4.Xóa học viên");
//            System.out.println("5.Thoát");
//            System.out.println("Mời bạn nhập chức nawng1->5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.1 Hiển thị danh sách học viên" +
                            "\n 1.2 Thêm mới học viên" +
                            "\n 1.3 Cập nhật thông tin học viên" +
                            "\n 1.4 Xóa học viên" +
                            "\n 1.5 Thoát");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            studentService.dispayListStudent();
                            break;
                        case 2:
                            studentService.addStudent();
                            break;
                        case 3:
                            studentService.updateStudent();
                            break;
                        case 4:
                            studentService.removeStudent();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này mời bạn lựa chọn lại");
                    }
                    break;
                case 2:
                    System.out.println("1.1 Hiển thị danh sách giảng viên" +
                            "\n 1.2 Thêm mới giảng viên" +
                            "\n 1.3 Cập nhật thông tin giảng viên" +
                            "\n 1.4 Xóa giảng viên" +
                            "\n 1.5 Thoát" +
                            "\n 1.6 Tìm kiếm giảng viên");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                          teacherService.displayListTeacher();
                            break;
                        case 2:
                         teacherService.addTeacher();
                            break;
                        case 3:
                          teacherService.updateTeacher();
                            break;
                        case 4:
                          teacherService.removeTeacher();
                            break;
                        case 5:
                            System.exit(0);
                            break;
                        case 6:
                            System.out.println("Hiển thị thông tin muốn tìm" +
                                    "\n 1. Tìm theo id" +
                                    "\n 2. Tìm theo tên");
                            int choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1){
                                case 1:
                                    teacherService.searchIdTeacher();
                                    break;
                                case 2:
                                    teacherService.searchNameTeacher();
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Không có lựa chọn này mời bạn lựa chọn lại");
                    }
                    break;
                case 3:
                    break;
            }

        }
    }

}
