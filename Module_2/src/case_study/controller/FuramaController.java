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
    private static final FacilityController facilityController = new FacilityController();
    private static final BookingController bookingController = new BookingController();
    private static final ContactController contactController = new ContactController();


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
                   facilityController.menuFacility();
                case 4:
                    bookingController.menuBooking();
                    break;
                case 5:
                    contactController.menuContact();
                  break;
                case 6:
                    System.exit(0);
                    break;
            }


        }
    }
}
