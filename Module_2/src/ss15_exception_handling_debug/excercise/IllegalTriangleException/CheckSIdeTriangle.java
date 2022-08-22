package ss15_exception_handling_debug.excercise.IllegalTriangleException;

import java.util.Scanner;

    public class CheckSIdeTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            CheckSIdeTriangle check = new CheckSIdeTriangle();

            while (true) {
                try {
                    System.out.println("Nhập cạnh thứ nhất");
                    double sideOne = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập cạnh thứ hai");
                    double sideTwo = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập cạnh thứ ba");
                    double sideThree = Double.parseDouble(sc.nextLine());
                    try {
                        check.checkTriangle(sideOne, sideTwo, sideThree);
                    } catch (TriangleException e) {
                        System.out.println(e.getMessage());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Không hợp lệ");
                }
            }
        }

        public void checkTriangle(double sideOne, double sideTwo, double sideThree) throws TriangleException {
            if (sideOne + sideTwo <= sideThree || sideOne + sideThree <= sideTwo || sideTwo + sideThree <= sideOne) {
                throw new TriangleException("Không phải là cạnh của tam giác");
            } else {
                System.out.println("Là cạnh của tam giác");
            }
        }

}
