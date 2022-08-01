package ss1_Introduction.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operator_Expression {
    public static void main(String[] args) {
        float width, height, area;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập width: ");
        width = scanner.nextFloat();

        System.out.println("Nhập height: ");
        height = scanner.nextFloat();

        area = width * height;
        System.out.println("Diện tích là: " +area);
    }
}
