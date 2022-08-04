package ss4_Class_And_Object.exercise.quadratic_Equation;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào c");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Hiển thị a,b,c:  " + quadraticEquation.display());
        if (quadraticEquation.GetDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm:");
        } else if (quadraticEquation.GetDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép=" + quadraticEquation.getRoot1());
        } else {
            System.out.println("Có 2 nghiệm phân biệt là");
            System.out.println("Nghiệm thứ nhất là:" + quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là: " + quadraticEquation.getRoot2());
        }


    }
}
