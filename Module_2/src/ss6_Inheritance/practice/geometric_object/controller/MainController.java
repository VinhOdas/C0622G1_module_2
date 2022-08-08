package ss6_Inheritance.practice.geometric_object.controller;

import ss6_Inheritance.practice.geometric_object.model.Square;

public class MainController {
    public static void main(String[] args) {
        Square square = new Square(2.0);
        System.out.println(square);
        System.out.println(square.getArea());


    }
}
