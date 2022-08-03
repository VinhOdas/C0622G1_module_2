package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,5,6,7,8};
        int[] arr1 = {56,6,34,23,6};
//        System.out.println("Nhập phần tử  mà bạn muốn tìm");
//        int length = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[arr.length + arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr.length + i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}