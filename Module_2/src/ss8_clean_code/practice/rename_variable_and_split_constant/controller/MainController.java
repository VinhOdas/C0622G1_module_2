package ss8_clean_code.practice.rename_variable_and_split_constant.controller;

import ss8_clean_code.practice.rename_variable_and_split_constant.model.Calculator;

public class MainController {
    public static void main(String[] args) {
        int firstOperand =5 ;
        int secondOperand=2;
        char operator='+' ;

        double result = Calculator.calculator(firstOperand,secondOperand,operator);
        System.out.println(result);
    }

}
