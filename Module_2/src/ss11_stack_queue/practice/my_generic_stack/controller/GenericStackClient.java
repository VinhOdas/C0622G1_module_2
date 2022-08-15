package ss11_stack_queue.practice.my_generic_stack.controller;

import ss11_stack_queue.practice.my_generic_stack.model.MyGenericStack;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfString();
        stackOfInteger();
    }

    private static void stackOfInteger() {

    }

    private static void stackOfString() {
        MyGenericStack<String> stringMyGenericStack = new MyGenericStack<>();
        stringMyGenericStack.push("1");
        stringMyGenericStack.push("2");
        stringMyGenericStack.push("3");
        System.out.println(stringMyGenericStack);
    }
}

