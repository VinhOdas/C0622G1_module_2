package ss2_Loop_Java.exercise;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        menu();

    }

    static void printRectangular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều rộng: ");
        int width = sc.nextInt();
        System.out.print("\nChiều cao: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printSquareTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều cao hình tam giác: ");
        int heightTriangle = sc.nextInt();
        // top left
        for (int i = heightTriangle; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= heightTriangle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printIsoscelesTriangle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Chiều cao hình tam giác:");
        int heightTriangle = sc.nextInt();

        for (int i = 1; i < heightTriangle; i++) {
            for (int j = 1; j <= i * -1 + heightTriangle; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void exit() {
        System.exit(0);
    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Exit");
            int chose = sc.nextInt();
            switch (chose) {
                case 1:
                    printRectangular();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    exit();
                    break;
            }

        }
    }
}

