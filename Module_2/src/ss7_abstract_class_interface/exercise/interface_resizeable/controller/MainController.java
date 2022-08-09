package ss7_abstract_class_interface.exercise.interface_resizeable.controller;

import ss7_abstract_class_interface.exercise.interface_resizeable.model.Circle;
import ss7_abstract_class_interface.exercise.interface_resizeable.model.Rectangle;
import ss7_abstract_class_interface.exercise.interface_resizeable.model.Shape;
import ss7_abstract_class_interface.exercise.interface_resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {
//    double random = Math.random() *100 +1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(1,2);
        shapes[0] = new Circle("green",true,5);
        shapes[0] = new Square(3,3,"green",true);
        for (Shape shape :shapes){
            shape.resize(Math.floor(Math.random()*100));
            System.out.println(shape);
            System.out.println();
        }
    }
}
