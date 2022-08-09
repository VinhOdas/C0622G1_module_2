package ss7_abstract_class_interface.exercise.interface_colorable.controller;

import ss7_abstract_class_interface.exercise.interface_colorable.model.*;

public class MainController {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,4);
        Shape square = new Square(3);
        Shape[] shapes = new Shape[]{circle,rectangle,square};
        for(Shape shape : shapes) {
            if (shape instanceof Colorable) {
                System.out.println(((Colorable) shape).howToColor());
            } else {
                System.out.println(shape.getArea());
            }
        }
    }
}
