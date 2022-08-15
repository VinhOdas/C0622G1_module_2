package ss11_stack_queue.exercise.convert_decimal_to_binary;

import java.util.Arrays;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int number = 100;
        for (int i = 0; i <number ; i++) {
                stack.push(number%2);
                number/=2;
        }

        while (!stack.isEmpty()) {
            System.out.printf("%d\t",stack.pop());
        }
    }
}
