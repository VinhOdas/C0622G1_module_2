package ss1_Introduction.practice;

import java.util.Scanner;

public class Linear_Equation_Resolver {
    public static void main(String[] args) {
        double A, B, X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        A = sc.nextDouble();
        System.out.println("Nhập b: ");
        B = sc.nextDouble();

        if (A != 0) {
            X = -B / A;
            System.out.println("Phương trình có 1 nghiệm duy nhất: " + X);
        }
        else if (A == 0 && B ==0){
            System.out.println("Phương trình có vô số nghiệm");
        }
        else if (A == 0 && B != 0){
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
