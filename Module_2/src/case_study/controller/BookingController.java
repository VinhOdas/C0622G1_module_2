package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class BookingController {
    private Scanner scanner = new Scanner(System.in);
    private static final FuramaController furama = new FuramaController();
    private static final IBookingService booking = new BookingService();

    public void menuBooking() {
        while (true) {
            try {
                System.out.println("1. Add new booking" +
                        "\n 2. Display list booking" +
                        "\n 3. Create new constracts" +
                        "\n 4. Display list contracts" +
                        "\n 5. Edit contracts" +
                        "\n 6. Return main menu");


            } catch (NumberFormatException e) {
                int choise = Integer.parseInt(scanner.nextLine());
                switch (choise) {
                    case 1:
                        booking.addBooking();
                        break;
                    case 2:
                        booking.diplayBooking();
                        break;
                    case 3:
                        booking.createNewConstracts();
                        break;
                    case 4:
                        booking.displayListContracts();
                        break;
                    case 5:
                        booking.editContact();
                        break;
                    case 6:
                        furama.displayMainMenu();
                        break;
                }
                break;
            }
        }
    }
}
