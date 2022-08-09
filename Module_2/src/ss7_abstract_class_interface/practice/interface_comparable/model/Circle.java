package ss7_abstract_class_interface.practice.interface_comparable.model;

public class Circle extends Shape {
    private static final String color = "green";
    private static final boolean filled = false;
    private double radius = 1.0;

    public Circle() {
        super(color, filled);
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return (this.radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius= %d", getRadius(),  "which is a subclass of %s",super.toString());
    }
}
