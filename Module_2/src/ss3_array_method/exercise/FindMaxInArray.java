package ss3_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray {
//    arr = [[1,2,3,4],[5,6,7,8]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng");
        int size = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột");
        int size1 = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[size][size1];
        int i,j;
        for ( i = 0; i < size; i++) {
            for ( j = 0; j <size1 ; j++) {
                System.out.println("Nhập giá trị phần tử trong mảng");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int max = arr[0][0];
        for ( i = 0; i <arr.length ; i++) {
            for ( j = 0; j <arr.length ; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
