package ss14_sort.practice;

public class BubbleSort {
public  static void bubbleSort(int[] arr){
    boolean isSwap = true;
    for (int i = 0; i <arr.length -1 && isSwap;  i++) {
        isSwap = false;
        int j;
        for (j = 0; j < arr.length -1 -i ; j++){
            if (arr[j] > arr[j + 1]){
                isSwap = true;
                int temp = arr[j +1];
                arr[j +1]   = arr[j];
                arr[j] = temp;
            }
        }
    }
}
}
