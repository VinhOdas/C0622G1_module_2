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
            try {
                System.out.println("1. Lựa chọn học viên" +
                        "\n 2. Lựa chọn giảng viên" +
                        "\n 3.Exit");


            }catch (NumberFormatException e){}

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.1 Hiển thị danh sách giảng viên" +
                            "\n 1.2 Thêm mới học viên" +
                            "\n 1.3 Cập nhật thông tin học viên" +
                            "\n 1.4 Xóa học viên" +
                            "\n 1.5 Tìm kiếm học viên" +
                            "\n 1.6 Sắp xếp  " +
                            "\n 1.7 Trở lại");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println("1.1.1. Hiển thị danh sách toàn bộ sinh viên" +
                                    "\n 1.1.2. Hiển thị danh sách sinh viên tùy chọn" +
                                    "\n 1.1.3 Quay trở lại menu");
                            choice = Integer.parseInt(scanner.nextLine());
                            switch (choice) {
                                case 1:
                                studentService.dispayListStudent();
                                break;
                                case 2:
                                    studentService.displayStudentOptional();
                                    break;
                            }
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
                            System.out.println("Hiển thị thông tin muốn tìm" +
                                    "\n 1. Tìm theo id" +
                                    "\n 2. Tìm theo tên");
                            int choice1 = Integer.parseInt(scanner.nextLine());
                            switch (choice1){
                                case 1:
                                    studentService.searchIdStudent();
                                    break;
                                case 2:
                                    studentService.searchNameStudent();
                                    break;
                            }

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
                            "\n 1.6 Tìm kiếm giảng viên" +
                            "\n 1.7 Xoa");
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
                        case 7:

                            teacherService.sortTeacher();
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
