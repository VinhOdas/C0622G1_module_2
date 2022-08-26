package case_study.controller;

import case_study.service.IFacilityService;
import case_study.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private Scanner scanner = new Scanner(System.in);
    private static final IFacilityService facilityService = new FacilityService();
    private static final FuramaController furamaController = new FuramaController();

    public void menuFacility() {
        while (true) {
            try {
                System.out.println("1. Display list facility" +
                        "\n 2. Add new facility" +
                        "\n 3. Display list facility maintenance" +
                        "\n 4. Return main menu");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    facilityService.addFacility();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    furamaController.displayMainMenu();
                    break;
            }
            break;
        }

    }
}
