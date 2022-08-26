package case_study.controller;



import case_study.service.*;
import case_study.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    private Scanner scanner = new Scanner(System.in);
//    private static final IVillaService villaService = new VillaService();
//    private static final IHouseService houseService = new HouseService();
//    private static final IRoomService roomService = new RoomService();
    private static final IEmployeeService employeeService = new EmployeeService();
    private static final IBookingService bookingService = new BookingService();
    private static final IContactService contactService = new ContactService();
    private static final IFacilityService facilityService = new FacilityService();
    private static final ICustomerService customerService = new CustomerService();
    private static final EmployeeController employeeController = new EmployeeController();
    private static final CustomerController customerController = new CustomerController();


    public void displayMainMenu() {
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Chào mừng tới khu nghỉ dưỡng Furama");
            try {
                System.out.println(" Mời bạn chọn dịch vụ muốn thuê" +
                        "\n 1. Employee Management" +
                        "\n 2. Customer Management" +
                        "\n 3. Facility Management" +
                        "\n 4. Booking Management " +
                        "\n 5. Promotion Management" +
                        "\n 6. Exit ");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    employeeController.menuEmployee();
                    break;
                case 2:
                    customerController.menuCustomer();
                    break;
                case 3:
                    System.out.println("1. Display list facility" +
                            "\n 2. Add new facility" +
                            "\n 3. Display list facility maintenance" +
                            "\n 4. Return main menu");
                    choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1. Add new booking" +
                            "\n 2. Display list booking" +
                            "\n 3. Create new constracts" +
                            "\n 4. Display list contracts" +
                            "\n 5. Edit contracts" +
                            "\n 6. Return main menu");
                    choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1. Display list customers use service" +
                            "\n 2. Display list customers get voucher" +
                            "\n 3. Return main menu"
                    );
                    choise = Integer.parseInt(scanner.nextLine());
                    switch (choise) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
            }


        }
    }
}
