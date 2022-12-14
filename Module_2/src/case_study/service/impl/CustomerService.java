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
            System.out.println("Kh??ng c??");
        } else {
            System.out.println("Ch???n 1 n???u b???n mu???n thay ?????i"

            );
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    String idUpdate ;
                    while (true) {
                        System.out.println("b???n mu???n thay ?????i id th??nh:(vd: EP01) ");
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
                            System.out.print("b???n mu???n thay ?????i t??n th??nh: (vd: Ph???m Quang Vinh) ");
                            nameUpdate = (sc.nextLine());
                            String str;
                            for (int i = 0; i < nameUpdate.length(); i++) {
                                str = "";
                                if ((str + nameUpdate.charAt(i)).matches("\\d+")) {
                                    throw new CheckedException("T??n b???n nh???p ko h???p l???");
                                }
                            }

                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);

                    do {
                        try {
                            System.out.println("b???n mu???n thay ?????i ng??y sinh th??nh:(vd: 17/11/1999) ");
                            String birthDayUpdate = sc.nextLine();

                            if (!birthDayUpdate.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
                                    "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
                                    "0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|" +
                                    "[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
                                    "(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
                                throw new CheckedException("D??? li???u kh??ng ????ng ?????nh d???ng");
                            }
                            if (Integer.parseInt(birthDayUpdate.substring(6)) > 2016) {
                                throw new CheckedException("D??? li???u kh??ng ????ng ?????nh d???ng");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (true);
                    do {
                        try {
                            System.out.println("b???n mu???n thay ?????i gi???i t??nh th??nh:(vd: Nam) ");
                            String genderUpdate = sc.nextLine();
                            if (genderUpdate.equals("Nam") && genderUpdate.equals("N???")) {
                                throw new CheckedException("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                            ;
                        }
                    } while (true);
                    while (true) {
                        try { System.out.println("b???n mu???n thay ?????i CMND:(9 ho???c 12 s???) ");
                            String identityCardUpdate = sc.nextLine();
                            if (!identityCardUpdate.matches("[0-9]{9}") && !identityCardUpdate.matches("[0-9]{12}")) {
                                throw new CheckedException("S??? ch???ng minh kh??ng h???p l???");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String phoneNumberUpdate;
                    while (true) {
                        try {System.out.println("b???n mu???n thay ?????i s??t th??nh:(10 ho???c 11 s???  ");
                            System.out.println("v?? s??? b???t ?????u l?? 0 v?? k??? ti???p l?? s??? kh??c 0)");
                            phoneNumberUpdate = sc.nextLine();
                            if (!phoneNumberUpdate.matches("[0][1-9][0-9]{8}") &&
                                    !phoneNumberUpdate.matches("[0][1-9][0-9]{11}")) {
                                throw new CheckedException("S??? ??i???n tho???i kh??ng h???p l???");
                            }
                            break;
                        } catch (CheckedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    String  mailUpdate;
                    while (true) {
                        try {
                            System.out.println("b???n mu???n thay ?????i gmail th??nh");
                            mailUpdate = sc.nextLine();
                            mailUpdate = sc.nextLine();
                            if (!mailUpdate.matches("\\w{6,25}[@]\\w{3,10}[.]\\w{1,10}")) {
                                throw new CheckedException("T??n email kh??ng h???p l???");
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
                            System.out.println("b???n mu???n thay ?????i th??nh kh??ch h??ng g??? " +
                                    "\n 1. Member" +
                                    "\n 2. Silver" +
                                    "\n 3. Gold " +
                                    "\n 4. Platinium" +
                                    "\n 5. Diamond" +
                                    "\n 6. Quay l???i l???a ch???n");
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
                                    System.out.println("Ch???n ????ng v??o");
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
                            System.out.println("b???n mu???n thay ?????i ?????a ch??? th??nh");
                            address = sc.nextLine();
                            if (!address.matches("([A-Z]//w+//s[/]{1,6})")){
                                throw  new CheckedException("Kh??ng ????ng ?????nh d???ng");
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
        System.out.println("Nh???p v??o id c???n t??m");
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
            System.out.println("Nh???p t??n c???a kh??ch h??ng");
            try {
                System.out.print("M???i b???n nh???p t??n: ");
                name = (sc.nextLine());
                String str;
                for (int i = 0; i < name.length(); i++) {
                    str = "";
                    if ((str + name.charAt(i)).matches("\\d+")) {
                        throw new CheckedException("T??n b???n nh???p ko h???p l???");
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
                System.out.print("M???i b???n nh???p ng??y sinh (): ");
                dayOfBirth = sc.nextLine();
                if (!dayOfBirth.matches("\\d+\\d+\\W+\\d+\\d+\\W+\\d+\\d+\\d+\\d")) {
                    throw new CheckedException("D??? li???u kh??ng ????ng ?????nh d???ng");
                }
                if (Integer.parseInt(dayOfBirth.substring(6)) > 2022) {
                    throw new CheckedException("D??? li???u kh??ng ????ng ?????nh d???ng");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String gender;
        do {
            System.out.println("Nh???p gi???i t??nh c???a kh??ch h??ng");
            try {
                gender = sc.nextLine();
                if (gender.equals("Nam") && gender.equals("N???")) {
                    throw new CheckedException("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                }
                break;
            } catch (CheckedException e) {
                System.out.println("Cho ph??p nh???p gi???i t??nh l?? nam ho???c n???, kh??ng nh???p ngo???i l???");
                ;
            }
        } while (true);

        String identityCard;
        while (true) {
            try {
                System.out.print("Nh???p v??o ch???ng minh nh??n d??n: ");
                identityCard = sc.nextLine();
                if (!identityCard.matches("[0-9]{9}")&&!identityCard.matches("[0-9]{12}")) {
                    throw new CheckedException("S??? ch???ng minh kh??ng h???p l???");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String phoneNumber;
        while (true) {
            try {
                System.out.print("Nh???p v??o s??? ??i???n tho???i: ");
                phoneNumber = sc.nextLine();
                if (!phoneNumber.matches("[0-9]{10}")||!identityCard.matches("[0-9]{11}")) {
                    throw new CheckedException("S??? ??i???n tho???i kh??ng h???p l???");
                }
                break;
            } catch (CheckedException e) {
                System.out.println(e.getMessage());
            }
        }
        String mail;
        while (true) {
            try {
                System.out.print("Nh???p v??o gmail: ");
                mail = sc.nextLine();
                if (!mail.matches("\\w{6,25}[@]\\w{3,10}[.]\\w{1,10}")) {
                    throw new CheckedException("T??n email kh??ng h???p l???");
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
                System.out.println("Vui l??ng ch???n m???t s??? l???a ch???n sau" +
                        "\n 1. Member" +
                        "\n 2. Silver" +
                        "\n 3. Gold " +
                        "\n 4. Platinium" +
                        "\n 5. Diamond" +
                        "\n 6. Quay l???i l???a ch???n");
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
                        System.out.println("Ch???n ????ng v??o");
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
                System.out.println("Nh???p v??o ?????a ch???");
                address = sc.nextLine();
                if (!address.matches("([A-Z]//w+//s{1,6})")){
                    throw  new CheckedException("Kh??ng ????ng ?????nh d???ng");
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
