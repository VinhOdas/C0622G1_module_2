package ss1_Introduction.practice;

import java.util.Scanner;

public class Day_Of_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tháng mà bạn muốn đếm ngày là:");
        int month;
        do {
            month = sc.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng '" + month + "' có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng '" + month + "' có 28 hoặc 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng '" + month + "' có 30 ngày");
                    break;
                default:
                    System.out.println("Yêu cầu nhập lại");
                    System.out.println("Nhập tháng mà bạn muốn đếm ngày là:");
            }
        }while(month < 1 || month > 12);
    }
}
