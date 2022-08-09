package ss7_abstract_class_interface.exercise.interface_resizeable.model;


public class Circle extends Shape  {
    private double radius = 1.0;

    public Circle(String color, boolean filled) {
        super(color, filled);
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

    @Override
    public void resize(double percent) {
        this.radius = radius * (1 + (percent/100));
    }
}
