package ss6_Inheritance.exercise.point.controller;

import ss6_Inheritance.exercise.point.model.Point2D;
import ss6_Inheritance.exercise.point.model.Point3D;

public class MainController {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f,3.0f);
        System.out.println(point2D);
        Point3D point3D = new Point3D(2.0f,3.0f,3.0f);
        System.out.println(point3D);
    }
}
