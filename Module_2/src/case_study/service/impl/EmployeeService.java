package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.sub_class.employee_manager.Employee;
import case_study.service.IEmployeeService;
import case_study.service.exception.CheckedException;
import homeWork.home_work_1.models.Student;
import homeWork.home_work_1.service.InfoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    public static Scanner sc = new Scanner(System.in);
    public static List<Employee> employees = new ArrayList<>();


    @Override
    public void displayEmployee() {

    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void editEmployee() {

    }

    public Employee infoStudent() {
        String idEmployee;
        while (true) {
            System.out.println("Enter id");
            try {
                idEmployee = sc.nextLine();
                if(!idEmployee.matches("[E][P]\\d{1,2}")) {
                    throw new CheckedException("Input invalid");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());;
            }
        }
        String name;
        do {
            System.out.println("Nhập tên của nhân viên");
            try {
                System.out.print("Mời bạn nhập tên: ");
                name = (sc.nextLine());
                String str;
                for (int i = 0; i < name.length(); i++) {
                    str = "";
                    if ((str + name.charAt(i)).matches("\\d+")) {
                        throw new CheckedException("Tên bạn nhập ko hợp lệ");
                    }
                }

                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String dayOfBirth;
        do {
            try {
                System.out.print("Mời bạn nhập ngày sinh: ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("\\d+\\d+\\W+\\d+\\d+\\W+\\d+\\d+\\d+\\d")) {
                    throw new CheckedException("Dữ liệu không đúng định dạng");
                }
                if (Integer.parseInt(dayOfBirth.substring(6)) > 2016) {
                    throw new CheckedException("Dữ liệu không đúng định dạng");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nhập giới tính của sinh viên");
            try {
                gender = sc.nextLine();
                if (gender.equals("Nam") && gender.equals("Nữ")) {
                    throw new CheckedException("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                }
                break;
            } catch (CheckedException e) {
                System.out.println("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                ;
            }
        } while (true);

        String identityCard;
        while (true) {
            try {
                System.out.print("Nhập vào chứng minh nhân dân: ");
                identityCard = sc.nextLine();
                if (!identityCard.matches("[0-9]{9}")||!identityCard.matches("[0-9]{12}")) {
                    throw new CheckedException("Số chứng minh không hợp lệ");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Nhập vào số điện thoại: ");
                phoneNumber = sc.nextLine();
                if (!phoneNumber.matches("[0-9]{10}")||!identityCard.matches("[0-9]{11}")) {
                    throw new CheckedException("Số điện thoại không hợp lệ");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String mail;
        while (true) {
            try {
                System.out.print("Nhập vào gmail: ");
                mail = sc.nextLine();
                if (!mail.matches("\\w{6,25}[@]\\w{3,10}[.]\\w{1,10}")) {
                    throw new CheckedException("Tên email không hợp lệ");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String level = "";
        while (true) {
            try {
                boolean check = false;
                System.out.println("Vui lòng chọn một số lựa chọn sau" +
                        "\n 1. Trung cấp" +
                        "\n 2. Cao đẳng" +
                        "\n 3. Đại học" +
                        "\n 4. sau đại học" +
                        "\n 5. Quay lại");
                int choice = Integer.parseInt(sc.nextLine());
                 switch (choice) {
                     case 1:
                         level = "Trung cấp";
                         check = true;
                         break;
                     case 2:
                         level = "Cao đẳng" ;
                         check = true;
                         break;
                     case 3:
                         level = "Đại học" ;
                         check = true;
                         break;
                     case 4:
                         level = "sau đại học" ;
                         check = true;
                         break;
                     case 5:
                         infoStudent();
                         break;
                     default:
                         System.out.println("Chọn đúng vào");
                         break;

                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        String location = "";
        while (true) {
            try {
                boolean check = false;
                System.out.println("Vui lòng chọn một số lựa chọn sau" +
                        "\n 1. Lễ tân" +
                        "\n 2. Phục vụ" +
                        "\n 3. Chuyên viên" +
                        "\n 4. Giám sát" +
                        "\n 5. Quản lý" +
                        "\n 6. Giám đốc" +
                        "\n 7. Quay lại");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        level = "Lễ tân";
                        check = true;
                        break;
                    case 2:
                        level = "Phục vụ" ;
                        check = true;
                        break;
                    case 3:
                        level = "Chuyên viên" ;
                        check = true;
                        break;
                    case 4:
                        level = "Giám sát" ;
                        check = true;
                        break;
                    case 5:
                        level = "Quản lý" ;
                        check = true;
                        break;
                    case 6:
                        level = "Giám đốc" ;
                        check = true;
                        break;
                    case 7:
                        infoStudent();
                        break;
                    default:
                        System.out.println("Chọn đúng vào");
                        break;

                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        double wage;
        do {
            System.out.println("Nhập giá tiền");
            try {
                wage = Double.parseDouble(sc.nextLine());
                if (wage < 0 || wage > 1000000000) {
                    throw new CheckedException("Giá tiền phải > 0 & <100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là một số");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        return new Employee(idEmployee,name,dayOfBirth,gender,identityCard,phoneNumber,mail,level,location,wage);
    }

}
