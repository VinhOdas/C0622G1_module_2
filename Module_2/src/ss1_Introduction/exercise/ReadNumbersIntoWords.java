package ss1_Introduction.exercise;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số để chuyển thành chữ");
        String units = "";
        switch (number % 10) {
            case 1:
                units = "Mốt";
                break;
            case 2:
                units = "Hai";
                break;
            case 3:
                units = "Ba";
                break;
            case 4:
                units = "Bốn";
                break;
            case 5:
                units = "Năm";
                break;
            case 6:
                units = "Sáu";
                break;
            case 7:
                units = "Bảy";
                break;
            case 8:
                units = "Tám";
                break;
            case 9:
                units = "Chín";
                break;
        }
        String tens = "";
        switch ((number / 10) % 10) {
            case 1:
                tens = "Mười";
                break;
            case 2:
                tens = "Hai mươi";
                break;
            case 3:
                tens = "Ba mươi ";
                break;
            case 4:
                tens = "Bốn mươi ";
                break;
            case 5:
                tens = "Năm mươi";
                break;
            case 6:
                tens = "Sáu mươi";
                break;
            case 7:
                tens = "Bảy mươi";
                break;
            case 8:
                tens = "Tám mươi";
                break;
            case 9:
                tens = "Chín mươi";
                break;

        }
        String hundreds = "";
        switch (number / 100) {
            case 1:
                hundreds = "Một trăm";
                break;
            case 2:
                hundreds = "Hai trăm";
                break;
            case 3:
                hundreds = "Ba trăm";
                break;
            case 4:
                hundreds = "Bốn trăm";
                break;
            case 5:
                hundreds = "Năm trăm";
                break;
            case 6:
                hundreds = "Sáu trăm";
                break;
            case 7:
                hundreds = "Bảy trăm";
                break;
            case 8:
                hundreds = "Tám trăm";
                break;
            case 9:
                hundreds = "Chín trăm";
                break;


        }
        System.out.println(+number);
        System.out.print(hundreds + tens + units);

    }
}
