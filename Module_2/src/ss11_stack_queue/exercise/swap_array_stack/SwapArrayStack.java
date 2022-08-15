package ss11_stack_queue.exercise.swap_array_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SwapArrayStack<N> {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = Integer.parseInt(scanner.nextLine());
        while (n < 0) {
            System.out.println("Nhập só lượng phần tử");
            n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Nhập lại");
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử trong mảng");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược là:" + Arrays.toString(arr));
        Stack<String> stringStack = new Stack<>();
        String string = "ok chưa";
        String string1 ="";
        for (int i = 0; i <string.length() ; i++) {
            stringStack.push(String.valueOf(string.charAt(i)));
        }
        for (int i = 0; i <string.length() ; i++) {
            string1 += stringStack.pop();
        }
        System.out.println("chuỗi push từ string là" + string1);
    }
}
