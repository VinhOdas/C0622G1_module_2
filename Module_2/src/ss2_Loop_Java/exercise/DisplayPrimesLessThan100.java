package ss2_Loop_Java.exercise;

import java.util.Scanner;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 2;
        if (i > 1) {
            for (i = 2; i < 100; i++) {
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
                    i++;
                }
            }
        }
    }
}

