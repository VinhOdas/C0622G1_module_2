package ss6_Inheritance.exercise.point_and_moveable_Point.controller;

import ss6_Inheritance.exercise.point_and_moveable_Point.model.MoveablePoint;
import ss6_Inheritance.exercise.point_and_moveable_Point.model.Point;

public class MainController {
    public static void main(String[] args) {
        Point point = new Point();
        MoveablePoint moveablePoint = new MoveablePoint(2, 2, 2, 2);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
