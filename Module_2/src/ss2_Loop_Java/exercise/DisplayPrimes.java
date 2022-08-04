package ss2_Loop_Java.exercise;

import java.util.Scanner;

public class DisplayPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào numbers là số lượng của sô nguyên tố cần hiển thị");
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 1;
        int i = 2;
        while (count <= numbers) {
            int j = 1;
            int check = 0;
            while (j <= i) {
                if (i % j == 0) {
                    check++;
                }
                j++;
            }
            if (check == 2) {
                    System.out.print(i + "\t");


                count++;
            }
            i++;
        }
    }
}
