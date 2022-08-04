package ss4_Class_And_Object.practice.rectangle;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng:");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào chiều cao");
        double height = Double.parseDouble(sc.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hiển thị hình chữ nhật \n" + rectangle.display());
        System.out.println("Diện tích hình chữ nhật " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật " + rectangle.getPerimeter());
    }
}
