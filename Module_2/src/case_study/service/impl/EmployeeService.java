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

    static {
        // idEmployee,name,dayOfBirth,gender,identityCard,phoneNumber,mail,level,location,wage);
        employees.add(new Employee("EP01", "Phạm Quang Vinh", "17/11/1999", "Nam", "123456789",
                "0799061071", "gamquangvinh@gmail.com", "Trung cấp", "Phục vụ", 1000000));
    }

    @Override
    public void displayEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        Employee employee = this.infoEmployee();
        employees.add(employee);
        System.out.println("Bạn đã thêm nhân viên thành công");
    }

    @Override
    public void editEmployee() {
        Employee employee = this.findEmployee();
        if (employee == null) {
            System.out.println("Không có");
        } else {
            System.out.println("Chọn 1 nếu bạn muốn thay đổi"

                    );
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    String idUpdate ;
                    while (true) {
                        System.out.println("bạn muốn thay đổi id thành:(vd: EP01) ");
                        try {
                            idUpdate = sc.nextLine();
                            employee.setIdEmployee(idUpdate);
                            if (!idUpdate.matches("[E][P]\\d{1,2}")) {
                                throw new CheckedException("Input invalid");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                            ;
                        }

                    }
                    do {
                        String nameUpdate;
                        try {
                            System.out.print("bạn muốn thay đổi tên thành: (vd: Phạm Quang Vinh) ");
                            nameUpdate = (sc.nextLine());
                            String str;
                            for (int i = 0; i < nameUpdate.length(); i++) {
                                str = "";
                                if ((str + nameUpdate.charAt(i)).matches("\\d+")) {
                                    throw new CheckedException("Tên bạn nhập ko hợp lệ");
                                }
                            }

                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);

                    do {
                        try {
                            System.out.println("bạn muốn thay đổi ngày sinh thành:(vd: 17/11/1999) ");
                            String birthDayUpdate = sc.nextLine();

                            if (!birthDayUpdate.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                                    "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
                                    "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|" +
                                    "[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                                    "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                                throw new CheckedException("Dữ liệu không đúng định dạng");
                            }
                            if (Integer.parseInt(birthDayUpdate.substring(6)) > 2016) {
                                throw new CheckedException("Dữ liệu không đúng định dạng");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);
                    do {
                        try {
                            System.out.println("bạn muốn thay đổi giới tính thành:(vd: Nam) ");
                            String genderUpdate = sc.nextLine();
                            if (genderUpdate.equals("Nam") && genderUpdate.equals("Nữ")) {
                                throw new CheckedException("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println("Cho phép nhập giới tính là nam hoặc nữ, không nhập ngoại lệ");
                            ;
                        }
                    } while (true);
                    while (true) {
                        try { System.out.println("bạn muốn thay đổi CMND:(9 hoặc 12 số) ");
                            String identityCardUpdate = sc.nextLine();
                            if (!identityCardUpdate.matches("[0-9]{9}") && !identityCardUpdate.matches("[0-9]{12}")) {
                                throw new CheckedException("Số chứng minh không hợp lệ");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String phoneNumberUpdate;
                    while (true) {
                        try {System.out.println("bạn muốn thay đổi sđt thành:(10 hoặc 11 số  ");
                            System.out.println("và số bắt đầu là 0 và kế tiếp là số khác 0)");
                            phoneNumberUpdate = sc.nextLine();
                            if (!phoneNumberUpdate.matches("[0][1-9][0-9]{8}") && !phoneNumberUpdate.matches("[0][1-9][0-9]{11}")) {
                                throw new CheckedException("Số điện thoại không hợp lệ");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String  mailUpdate;
                    while (true) {
                        try {
                            System.out.println("bạn muốn thay đổi gmail thành");
                             mailUpdate = sc.nextLine();
                            mailUpdate = sc.nextLine();
                            if (!mailUpdate.matches("\\w{6,25}[@]\\w{3,10}[.]\\w{1,10}")) {
                                throw new CheckedException("Tên email không hợp lệ");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String levelUpdate ="";
                    while (true) {
                        try {
                            boolean check = false;
                            System.out.println("bạn muốn thay đổi trình độ học vấn thành" +
                                    "\n 1. Trung cấp" +
                                    "\n 2. Cao đẳng" +
                                    "\n 3. Đại học" +
                                    "\n 4. sau đại học" +
                                    "\n 5. Quay lại");
                            int choice = Integer.parseInt(sc.nextLine());
                            switch (choice) {
                                case 1:
                                    levelUpdate = "Trung cấp";
                                    check = true;
                                    break;
                                case 2:
                                    levelUpdate = "Cao đẳng";
                                    check = true;
                                    break;
                                case 3:
                                    levelUpdate = "Đại học";
                                    check = true;
                                    break;
                                case 4:
                                    levelUpdate = "sau đại học";
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
                    String locationUpdate = "";
                    while (true) {
                        try {
                            boolean check = false;
                            System.out.println("bạn muốn thay đổi vị trí công việc thành" +
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
                                    locationUpdate = "Lễ tân";
                                    check = true;
                                    break;
                                case 2:
                                    locationUpdate = "Phục vụ";
                                    check = true;
                                    break;
                                case 3:
                                    locationUpdate = "Chuyên viên";
                                    check = true;
                                    break;
                                case 4:
                                    locationUpdate = "Giám sát";
                                    check = true;
                                    break;
                                case 5:
                                    locationUpdate = "Quản lý";
                                    check = true;
                                    break;
                                case 6:
                                    locationUpdate = "Giám đốc";
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
                        try {
                            System.out.println("bạn muốn thay đổi tiền lương");
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

    public Employee findEmployee() {
        System.out.println("Nhập vào id cần tìm");
        String id = sc.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getIdEmployee().equals(id)) {
                return employees.get(i);
            }
        }
        return null;
    }

    public Employee infoEmployee() {
        String idEmployee;
        while (true) {
            System.out.println("Enter id:(vd: EP01)");
            try {
                idEmployee = sc.nextLine();
                if (!idEmployee.matches("[E][P]\\d{1,2}")) {
                    throw new CheckedException("Input invalid");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
                ;
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

        String dayOfBirth;
        do {
            try {
                System.out.print("Mời bạn nhập ngày sinh:(vd: 17/11/1999) ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                        "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
                        "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|" +
                        "[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                        "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
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
                    throw new CheckedException("Giá tiền phải > 0 & <100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là một số");
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        return new Employee(idEmployee, name, dayOfBirth, gender, identityCard, phoneNumber, mail, level, location, wage);
    }

}
