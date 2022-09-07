package case_study.service.impl;

import case_study.controller.FuramaController;
import case_study.model.sub_class.employee_manager.Employee;
import case_study.service.IEmployeeService;
import case_study.service.exception.CheckedException;
import case_study.utils.read_file.ReadFile;
import case_study.utils.write_file.WriteFileEmployee;
import case_study.utils.write_file.WriteFileList;
import homeWork.home_work_1.models.Student;
import homeWork.home_work_1.service.InfoException;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    public static Scanner sc = new Scanner(System.in);
    public static List<Employee> employees = new ArrayList<>();
    private static final String PATH_EMPLOYEE = "src\\case_study\\data\\Employee.CSV";
    private static final String NAME_PERSON = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$";
    private static final String DAY_OF_BIRTH = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)" +
            "|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    static {
        // idEmployee,name,dayOfBirth,gender,identityCard,phoneNumber,mail,level,location,wage);
        employees.add(new Employee("EP01", "Phạm Quang Vinh", "17/11/1999", "Nam", "123456789",
                "0799061071", "gamquangvinh@gmail.com", "Trung cấp", "Phục vụ", 1000000));
    }

    @Override
    public void displayEmployee() {
      employees =  ReadFile.readEmployeeList(PATH_EMPLOYEE);
        if (employees.size() == 0) {
            System.out.println("List the employee is empty");
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addEmployee() throws IOException {
        employees = ReadFile.readEmployeeList(PATH_EMPLOYEE);
        Employee employee = this.infoEmployee();
        employees.add(employee);
        System.out.println("Bạn đã thêm nhân viên thành công");
        try {
            WriteFileEmployee.writeEmployeeFile(PATH_EMPLOYEE,employees);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void editEmployee() throws IOException {
        employees = ReadFile.readEmployeeList(PATH_EMPLOYEE);
        Employee employee = this.findEmployee();

        int positionEdit = employees.indexOf(employee);

        if (employee == null) {
            System.out.println("No have id in list employee");
        } else {
            int chooseEdit = 0;
            do {
                System.out.println("--------------------------");
                System.out.println("Employee need edit" +
                        "\n 1. Name of Employee" +
                        "\n 2. Day of birth of employee" +
                        "\n 3. Gender of employee" +
                        "\n 4. Id Card of employee" +
                        "\n 5. Name of phone employee" +
                        "\n 6. Email of employee" +
                        "\n 7. Id of employee" +
                        "\n 8. Level of employee" +
                        "\n 9. Location of employee" +
                        "\n 10. Wage of employee" +
                        "\n 11. Return menu" +
                        "\n 12. Exit");
                try {
                    chooseEdit = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input invalid");
                }
                switch (chooseEdit) {
                    case 1:
                        String nameEmployeeEdit;
                        do {
                            System.out.println("Enter name of Employee");
                            try {
                                nameEmployeeEdit = sc.nextLine();
                                if (!nameEmployeeEdit.matches(NAME_PERSON)) {
                                    throw new CheckedException("Input invalid");
                                }
                                break;
                            } catch (CheckedException e) {
                                System.out.println(e.getMessage());
                            }
                        } while (true);
                        employees.get(positionEdit).setIdEmployee(nameEmployeeEdit);
                        System.out.println("Success Edit");
                        break;
                    case 2:
                        String dayOfBirthEdit;
                        do {
                            System.out.println("Enter day of birth edit to employee");
                            try {
                                dayOfBirthEdit = sc.nextLine();
                                if (Integer.parseInt(dayOfBirthEdit.substring(6)) > 2014) {
                                    throw new CheckedException("Year old must be >18");
                                }
                                if (Integer.parseInt(dayOfBirthEdit.substring(6)) < 1922) {
                                    throw new CheckedException("Year old mus be <100");
                                }
                                if (!dayOfBirthEdit.matches(DAY_OF_BIRTH)) {
                                    throw new CheckedException("Input invalid");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Day of birth must be a number");
                            } catch (CheckedException | StringIndexOutOfBoundsException e) {
                                System.out.println("Input invalid and string index of bound");
                            }
                        } while (true);
                        employees.get(positionEdit).setBirthDay(dayOfBirthEdit);
                        System.out.println("Success Edit");
                        break;
                    case 3:
                        String genderEdit;
                        do {
                            System.out.println("Enter gender of Employees");
                            try {
                                genderEdit = sc.nextLine();
                                if (!genderEdit.equals("male") && !genderEdit.equals("female")) {
                                    throw new InfoException("Let enter gender is male or female, don't input exception");
                                }
                                break;
                            } catch (InfoException e) {
                                System.out.println("Let enter gender is male or female, don't input exception");
                            }
                        } while (true);
                        employees.get(positionEdit).setGender(genderEdit);
                        System.out.println("Success Edit");
                        break;
                    case 4:
                        String identityCard;
                        while (true) {
                            try {
                                System.out.print("Nhập vào chứng minh nhân dân:(9 hoặc 12 số) ");
                                identityCard = sc.nextLine();

                                if (!identityCard.matches("[0-9]{9}") && !identityCard.matches("[0-9]{12}")) {
                                    throw new CheckedException("Số chứng minh không hợp lệ");
                                }
                                employees.get(positionEdit).setIdentityCard(identityCard);
                                System.out.println("Success Edit");
                                break;
                            } catch (CheckedException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        break;
                    case 5:
                        String phoneNumber;
                        while (true) {
                            try {
                                System.out.print("Nhập vào số điện thoại:(10 hoặc 11 số ");
                                System.out.print("và số bắt đầu là 0 và kế tiếp là số khác 0)" +
                                        "\n vd: 0799061071 ");
                                phoneNumber = sc.nextLine();
                                if (!phoneNumber.matches("[0][1-9][0-9]{8}") && !phoneNumber.matches("[0][1-9][0-9]{11}")) {
                                    throw new CheckedException("Số điện thoại không hợp lệ");
                                }
                                break;
                            } catch (CheckedException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        employees.get(positionEdit).setPhoneNumber(phoneNumber);
                        System.out.println("Success Edit");
                        break;
                    case 6:
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
                        employees.get(positionEdit).setMail(mail);
                        System.out.println("Success Edit");
                        break;
                    case 7:
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
                                        level = "Cao đẳng";
                                        check = true;
                                        break;
                                    case 3:
                                        level = "Đại học";
                                        check = true;
                                        break;
                                    case 4:
                                        level = "sau đại học";
                                        check = true;
                                        break;
                                    case 5:
                                        infoEmployee();
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
                        employees.get(positionEdit).setIdEmployee(level);
                        System.out.println("Success Edit");
                        break;
                    case 8:
                        String levelEdit = "";
                        while (true) {
                            try {
                                boolean check = false;
                                System.out.println("Enter select option to edit" +
                                        "\n 1. Intermediate" +
                                        "\n 2. College" +
                                        "\n 3. University" +
                                        "\n 4. After university" +
                                        "\n 5. Return");
                                int choice = Integer.parseInt(sc.nextLine());
                                switch (choice) {
                                    case 1:
                                        levelEdit = "Intermediate";
                                        check = true;
                                        break;
                                    case 2:
                                        levelEdit = "College";
                                        check = true;
                                        break;
                                    case 3:
                                        levelEdit = "University";
                                        check = true;
                                        break;
                                    case 4:
                                        levelEdit = "After university";
                                        check = true;
                                        break;
                                    case 5:
                                        infoEmployee();
                                        break;
                                    default:
                                        System.out.println("Your selection is not suitable, selection from 1 to 5");
                                        break;

                                }
                                if (check) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Input invalid");
                            }
                        }
                        employees.get(positionEdit).setLevel(levelEdit);
                        System.out.println("Success Edit");
                        break;
                    case 9:
                        String locationEdit = " ";
                        while (true) {
                            try {
                                boolean check = false;
                                System.out.println("Enter select option to edit" +
                                        "\n 1. Receptionist" +
                                        "\n 2. Service" +
                                        "\n 3. Expert" +
                                        "\n 4. Monitoring" +
                                        "\n 5. Manage" +
                                        "\n 6. Manager" +
                                        "\n 7. Return");
                                int choice = Integer.parseInt(sc.nextLine());
                                switch (choice) {
                                    case 1:
                                        locationEdit = "Receptionist";
                                        check = true;
                                        break;
                                    case 2:
                                        locationEdit = "Service";
                                        check = true;
                                        break;
                                    case 3:
                                        locationEdit = "Expert";
                                        check = true;
                                        break;
                                    case 4:
                                        locationEdit = "Monitoring";
                                        check = true;
                                        break;
                                    case 5:
                                        locationEdit = "Manage";
                                        check = true;
                                        break;
                                    case 6:
                                        locationEdit = "Manager";
                                        check = true;
                                        break;
                                    case 7:
                                        infoEmployee();
                                        break;
                                    default:
                                        System.out.println("Your selection is not suitable, selection from 1 to 7");
                                        break;

                                }
                                if (check) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Input invalid");
                            }
                        }
                        employees.get(positionEdit).setLocation(locationEdit);
                        System.out.println("Success Edit");
                        break;
                    case 10:
                        double wageEdit;
                        do {
                            System.out.println("Enter wage of Employees");
                            try {
                                wageEdit = Double.parseDouble(sc.nextLine());
                                if (wageEdit < 0) {
                                    throw new CheckedException("Id must be >0");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Score must be a number");
                            } catch (CheckedException e) {
                                System.out.println("Input invalid");
                            }
                        } while (true);
                        employees.get(positionEdit).setWage(wageEdit);
                        System.out.println("Success Edit");
                        break;
                    case 11:
                        editEmployee();
                        break;
                    case 12:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Your selection is not suitable, selections from 1 to 12");
                }
                break;
            } while (true);
            WriteFileEmployee.writeEmployeeFile(PATH_EMPLOYEE, employees);
        }
    }

    public Employee findEmployee() {
        System.out.println("Nhập vào id cần tìm");
        String id = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (!employees.get(i).getIdEmployee().equals(id)) {
                System.out.println("mày ngu thì chết mẹ mày đi");
                break;
            }
            return employees.get(i);
        }
        return null;
    }

    public Employee infoEmployee() throws IOException {
        employees = ReadFile.readEmployeeList(PATH_EMPLOYEE);
        String idEmployee;
        while (true) {
            try {
                System.out.println("Enter id:(vd: EP01)");
                idEmployee = sc.nextLine();
                if (!idEmployee.matches("[E][P]\\d{1,2}")) {
                    throw new CheckedException("Input invalid");
                }
                for (Employee employee : employees) {
                    if (employee.getIdEmployee().equals(idEmployee)) {
                            throw new CheckedException("hello");
                    }
                }
                break;

            } catch (CheckedException e) {
                System.out.println(e.getMessage());

            }
        }
        String name;
        do {
            System.out.println("Nhập tên của nhân viên");
            try {
                System.out.print("Mời bạn nhập tên:(vd: Phạm Quang Vinh) ");
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

        System.out.println("nhập ngày sinh (dd/MM/yyyy)");
        String dayOfBirth;
        LocalDate dateNow = LocalDate.now();
        LocalDate date = null;
        while (true) {
            try {
                dayOfBirth = sc.nextLine();
                date = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Period period = Period.between(date,dateNow);
                if (dayOfBirth.matches(DAY_OF_BIRTH) && period.getYears() < 100 && period.getYears() > 18) {
                    break;
                } else {
                    throw new InputMismatchException("Nhập sai thời gian hoặc định dạng");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new InputMismatchException("không nên nhập ký tự số");
            }
        }

        String gender;
        do {
            System.out.println("Nhập giới tính của nhân viên(vd: Nam)");
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
                System.out.print("Nhập vào chứng minh nhân dân:(9 hoặc 12 số) ");
                identityCard = sc.nextLine();
                if (!identityCard.matches("[0-9]{9}") && !identityCard.matches("[0-9]{12}")) {
                    throw new CheckedException("Số chứng minh không hợp lệ");
                }
//                if (!identityCard.matches("[0-9]{12}")){
//                    throw new CheckedException("Số chứng minh không hợp lệ");
//                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Nhập vào số điện thoại:(10 hoặc 11 số ");
                System.out.print("và số bắt đầu là 0 và kế tiếp là số khác 0)" +
                        "\n vd: 0799061071 ");
                phoneNumber = sc.nextLine();
                if (!phoneNumber.matches("[0][1-9][0-9]{8}") && !phoneNumber.matches("[0][1-9][0-9]{11}")) {
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
                        level = "Cao đẳng";
                        check = true;
                        break;
                    case 3:
                        level = "Đại học";
                        check = true;
                        break;
                    case 4:
                        level = "sau đại học";
                        check = true;
                        break;
                    case 5:
                        infoEmployee();
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
                            location = "Lễ tân";
                            check = true;
                            break;
                        case 2:
                            location = "Phục vụ";
                            check = true;
                            break;
                        case 3:
                            location = "Chuyên viên";
                            check = true;
                            break;
                        case 4:
                            location = "Giám sát";
                            check = true;
                            break;
                        case 5:
                            location = "Quản lý";
                            check = true;
                            break;
                        case 6:
                            location = "Giám đốc";
                            check = true;
                            break;
                        case 7:
                            infoEmployee();
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
            System.out.println("Nhập tiền lương");
            try {
                wage = Double.parseDouble(sc.nextLine());
                if (wage < 0 || wage > 1000000000) {
                    throw new CheckedException("Giá tiền phải > 0 & <10000000000000");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là một số");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        WriteFileEmployee.writeEmployeeFile(PATH_EMPLOYEE,employees);
        return new Employee(idEmployee, name, dayOfBirth, gender, identityCard, phoneNumber, mail, level, location, wage);
    }

}
