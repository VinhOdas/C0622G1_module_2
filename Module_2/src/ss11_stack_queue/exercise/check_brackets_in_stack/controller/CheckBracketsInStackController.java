package ss11_stack_queue.exercise.check_brackets_in_stack.controller;

import ss11_stack_queue.exercise.check_brackets_in_stack.model.CheckBrackets;

import java.util.Scanner;

public class CheckBracketsInStackController {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to check");
        String strings = scan.nextLine();


        System.out.println(CheckBrackets.checkBracket(strings) ? "Well" : "No");
    }
}
