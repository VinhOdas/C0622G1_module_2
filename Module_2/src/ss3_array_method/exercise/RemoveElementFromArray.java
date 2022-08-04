package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 3, 4, 5, 6, 5, 8, 5, 0, 5, 5};
        System.out.println("Nhập phần tử  mà bạn muốn tìm");
        int element;
        element = Integer.parseInt(sc.nextLine());
        int check ;

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j +1];
                }
                arr[arr.length-1]=0;
                i--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
