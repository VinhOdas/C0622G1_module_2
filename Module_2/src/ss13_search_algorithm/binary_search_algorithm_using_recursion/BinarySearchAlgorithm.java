package ss13_search_algorithm.binary_search_algorithm_using_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        System.out.println();

    }

    public static int binarySearch(int[] array, int value, int left, int right) {
        array = new int[]{1, 3, 3, 6, 5, 10, 7};

        Arrays.sort(array);

        int middle = (left + right) / 2;

        if (left <= right) {
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                return binarySearch(array, value, middle + 1, right);
            }
            if (value < array[middle]) {
                return binarySearch(array, value, middle - 1, right);
            }
        }
        return -1;
    }

}
