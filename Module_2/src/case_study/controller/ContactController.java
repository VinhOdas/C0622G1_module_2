package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.IContactService;
import case_study.service.impl.BookingService;
import case_study.service.impl.ContactService;

import java.util.Scanner;

public class ContactController {
    private Scanner scanner = new Scanner(System.in);
    private static final FuramaController furama = new FuramaController();
    private static final IContactService contactService = new ContactService();
    public void menuContact() {
        while (true) {
            try {
                System.out.println("1. Display list customers use service" +
                        "\n 2. Display list customers get voucher" +
                        "\n 3. Return main menu"
                );


            } catch (NumberFormatException e) {
                int choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 1:
                        contactService.displayService();
                        break;
                    case 2:
                        contactService.diplayVoucher();
                        break;
                    case 3:
                        furama.displayMainMenu();
                        break;

                }
                break;
            }
        }
    }

}
