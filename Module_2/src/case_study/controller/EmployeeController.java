package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private Scanner scanner = new Scanner(System.in);
    private static final IEmployeeService employeeService = new EmployeeService();
    private static final FuramaController furamaController = new FuramaController();

    public void menuEmployee() {
        while (true) {
            try {
                System.out.println("1. Display list employee" +
                        "\n 2. Add new employee" +
                        "\n 3. Edit employee" +
                        "\n 4. Return main menu");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
            }

        }
    }
}

