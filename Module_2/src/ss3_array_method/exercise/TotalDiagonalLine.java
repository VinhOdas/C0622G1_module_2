package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
