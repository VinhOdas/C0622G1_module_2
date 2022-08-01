package ss1_Introduction.exercise;

import java.util.Scanner;

public class Currency_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD muốn chuyển đổi:");
        double usd = sc.nextDouble();
        final double exchangeRate = 23000;
       double vnd = usd * exchangeRate;
        System.out.println("Số tiền khi chuyển thành VNĐ là: " +vnd);



    }
}
