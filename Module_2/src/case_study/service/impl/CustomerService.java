package case_study.service.impl;

import case_study.model.sub_class.employee_manager.Customer;
import case_study.model.sub_class.employee_manager.Employee;
import case_study.service.ICustomerService;
import case_study.service.exception.CheckedException;
import case_study.utils.read_file.ReadFile;
import case_study.utils.write_file.WriteFileList;
import homeWork.home_work_1.utils.read_write_file.WriteFile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static Scanner sc = new Scanner(System.in);
    public static List<Customer> customers = new LinkedList<>();
    private static final String PATH_CUSTOMER = "src\\case_study\\data\\Customer.CSV";

    @Override
    public void displayCustomer() {
        ReadFile.readCustomerList(PATH_CUSTOMER);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        Customer customer = this.infoCustomer();
        customers.add(customer);
        WriteFileList.writeFile(PATH_CUSTOMER, convertCustomerToString(customers));

    }
    private String convertString(Customer customer){
        return customer.getIdCustomer()+","+customer.getName()+","+customer.getBirthDay()
                +","+customer.getGender()+","+customer.getIdentityCard()+
                ","+customer.getPhoneNumber()+","+customer.getMail()+","
                +customer.getTypeOfGuest()+","+customer.getAddress();
    }

    private List<String> convertCustomerToString(List<Customer> customers) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customers) {
            stringList.add(convertString(customer));
        }
        return stringList;
    }
    @Override
    public void editCustomer() {
        ReadFile.readCustomerList(PATH_CUSTOMER);
        Customer customer = this.findCustomer();
        if (customer == null) {
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
                            customer.setIdCustomer(idUpdate);
                            if (!idUpdate.matches("[C][T]\\d{1,2}")) {
                                throw new CheckedException("Input invalid(vd: CT01)");
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
                            if (!phoneNumberUpdate.matches("[0][1-9][0-9]{8}") &&
                                    !phoneNumberUpdate.matches("[0][1-9][0-9]{11}")) {
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
                    String typeOfGuest = "";
                    while (true) {
                        try {
                            boolean check = false;
                            System.out.println("bạn muốn thay đổi thành khách hàng gì? " +
                                    "\n 1. Member" +
                                    "\n 2. Silver" +
                                    "\n 3. Gold " +
                                    "\n 4. Platinium" +
                                    "\n 5. Diamond" +
                                    "\n 6. Quay lại lựa chọn");
                            int choice = Integer.parseInt(sc.nextLine());
                            switch (choice) {
                                case 1:
                                    typeOfGuest = "Member";
                                    check = true;
                                    break;
                                case 2:
                                    typeOfGuest = "Silver" ;
                                    check = true;
                                    break;
                                case 3:
                                    typeOfGuest = "Gold" ;
                                    check = true;
                                    break;
                                case 4:
                                    typeOfGuest = "Platinium" ;
                                    check = true;
                                    break;
                                case 5:
                                    typeOfGuest = "Diamond" ;
                                    check = true;
                                    break;
                                case 6:
                                    infoCustomer();
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

                    String address;
                    while (true){
                        try {
                            System.out.println("bạn muốn thay đổi địa chỉ thành");
                            address = sc.nextLine();
                            if (!address.matches("([A-Z]//w+//s[/]{1,6})")){
                                throw  new CheckedException("Không đúng định dạng");
                            }
                            break;
                        }catch (CheckedException e){
                            System.out.println(e.getMessage());
                        }
                    }
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

        WriteFileList.writeFile(PATH_CUSTOMER,convertCustomerToString(customers));
    }

    public Customer findCustomer() {
        System.out.println("Nhập vào id cần tìm");
            String id = sc.nextLine();
            for (int i = 0; i < customers.size(); i++) {
                customers.get(i).getIdCustomer().equals(id);
                return customers.get(i);
            }

        return null;
    }





    /**
     *
     * @return
     */
    public Customer infoCustomer() {
        ReadFile.readCustomerList(PATH_CUSTOMER);
        String idCustomer;
        while (true) {
            System.out.println("Enter id");
            try {
                System.out.println("Enter id:(vd: EP01)");
                idCustomer = sc.nextLine();
                if (!idCustomer.matches("[E][P]\\d{1,2}")) {
                    throw new CheckedException("Input invalid");
                }
                for (Customer customer : customers) {
                    if (customer.getIdCustomer().equals(idCustomer)) {
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
            System.out.println("Nhập tên của khách hàng");
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
                System.out.print("Mời bạn nhập ngày sinh (): ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("\\d+\\d+\\W+\\d+\\d+\\W+\\d+\\d+\\d+\\d")) {
                    throw new CheckedException("Dữ liệu không đúng định dạng");
                }
                if (Integer.parseInt(dayOfBirth.substring(6)) > 2022) {
                    throw new CheckedException("Dữ liệu không đúng định dạng");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nhập giới tính của khách hàng");
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
                if (!identityCard.matches("[0-9]{9}")&&!identityCard.matches("[0-9]{12}")) {
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
        String typeOfGuest = "";
        while (true) {
            try {
                boolean check = false;
                System.out.println("Vui lòng chọn một số lựa chọn sau" +
                        "\n 1. Member" +
                        "\n 2. Silver" +
                        "\n 3. Gold " +
                        "\n 4. Platinium" +
                        "\n 5. Diamond" +
                        "\n 6. Quay lại lựa chọn");
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        typeOfGuest = "Member";
                        check = true;
                        break;
                    case 2:
                        typeOfGuest = "Silver" ;
                        check = true;
                        break;
                    case 3:
                        typeOfGuest = "Gold" ;
                        check = true;
                        break;
                    case 4:
                        typeOfGuest = "Platinium" ;
                        check = true;
                        break;
                    case 5:
                        typeOfGuest = "Diamond" ;
                        check = true;
                        break;
                    case 6:
                        infoCustomer();
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
       String address;
        while (true){
            try {
                System.out.println("Nhập vào địa chỉ");
                address = sc.nextLine();
                if (!address.matches("([A-Z]//w+//s{1,6})")){
                    throw  new CheckedException("Không đúng định dạng");
                }
                break;
            }catch (CheckedException e){
                System.out.println(e.getMessage());
            }
        }

        WriteFile.writeFile(PATH_CUSTOMER,convertCustomerToString(customers));
        return new Customer(idCustomer,name,dayOfBirth,gender,identityCard,phoneNumber,mail,typeOfGuest,address);

    }

}
