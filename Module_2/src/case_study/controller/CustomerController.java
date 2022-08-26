package case_study.controller;

import case_study.service.ICustomerService;
import case_study.service.IEmployeeService;
import case_study.service.impl.CustomerService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class CustomerController {
    private Scanner scanner = new Scanner(System.in);
    private static final ICustomerService customerService = new CustomerService();
    private static final FuramaController furamaController = new FuramaController();

    public void menuCustomer() {
        while (true) {
            try {
                System.out.println("1. Display list customers" +
                        "\n 2. Add new customer" +
                        "\n 3. Edit customer" +
                        "\n 4. Return main menu");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                   customerService.displayCustomer();
                    break;
                case 2:
                   customerService.addCustomer();
                    break;
                case 3:
                   customerService.editCustomer();
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
            }

        }
    }
}
