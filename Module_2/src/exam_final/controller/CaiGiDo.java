package exam_final.controller;

import java.util.Scanner;

public class CaiGiDo {
    private Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Chào mừng tới khu nghỉ dưỡng Furama");
            try {
                System.out.println(" Mời bạn chọn dịch vụ muốn thuê" +
                        "\n 1. " +
                        "\n 2. " +
                        "\n 3. " +
                        "\n 4.  " +
                        "\n 5. " +
                        "\n 6. Exit ");

            } catch (NumberFormatException e) {
                System.out.println("lựa chọn không hợp lệ");
            }
            int choise = Integer.parseInt(scanner.nextLine());
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
                    System.exit(0);
                    break;
            }


        }
    }
}
