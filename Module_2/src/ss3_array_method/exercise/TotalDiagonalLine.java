package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDiagonalLine {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 3},
                {5, 7, 3},
                {1, 2, 8}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i][i];

        }
        System.out.println(sum);
    }

}

