package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 3, 4, 5, 6, 5, 8, 5, 0, 5, 5};
        System.out.println("Nhập phần tử  mà bạn muốn thêm");
        int element;
        element = sc.nextInt();
        int index;
        do {
            System.out.println("Nhập index");
            index = sc.nextInt();
            if (index <= -1 || index >= arr.length) {
                System.out.println("Không được phép thêm vào:");
            }
        } while (index <= -1 || index >= arr.length);
        for (int i = arr.length - 1; index < i; i--) {
            arr[i] = arr[i -1];
        }
        arr[index] = element;
        System.out.println(Arrays.toString(arr));

    }
}
