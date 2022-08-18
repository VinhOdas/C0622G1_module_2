package ss14_sort.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j +1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử ");
        int number = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[number];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Nhập vào phần tử của mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arr));

        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
