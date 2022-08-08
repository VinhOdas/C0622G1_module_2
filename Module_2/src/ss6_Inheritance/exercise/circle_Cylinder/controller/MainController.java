package ss6_Inheritance.exercise.circle_Cylinder.controller;

import ss6_Inheritance.exercise.circle_Cylinder.model.Circle;
import ss6_Inheritance.exercise.circle_Cylinder.model.Cylinder;

public class MainController {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0,"green");
        System.out.println(circle);
        System.out.printf("%.2f\n",circle.getArea());
        System.out.println(circle.getColor());

        Cylinder cylinder = new Cylinder(5.0,"blue",4.0);
        System.out.printf("%.2f\n",cylinder.getVolume());
        System.out.printf("%.2f",cylinder.getArea());
    }
}
