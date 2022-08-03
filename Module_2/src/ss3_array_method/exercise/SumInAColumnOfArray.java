package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumInAColumnOfArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{1,2,3}};
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cột mà bạn ");
        int pillar = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <arr[i].length ; j++) {
                    if (pillar == j) {
                        sum += arr[i][j];
                    }
                }
            }
        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        int[]arr;
//        int size;
//         while{
//            if (size < 0 || size > 20){
//                System.out.println("Sai.");
//            }
//        }
//
//        for (int i = 0; i <size ; i++) {
//            System.out.println("Nhập vào giá trị của phần tử");
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
        }
    }

