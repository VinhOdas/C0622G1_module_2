package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumInAColumnOfArray {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {1, 2, 3}};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột mà bạn ");
        int pillar = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][pillar];
        }
        System.out.println(sum);

    }
}

