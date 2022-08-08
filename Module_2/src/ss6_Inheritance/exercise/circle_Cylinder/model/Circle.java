package ss6_Inheritance.exercise.circle_Cylinder.model;

public class Circle {
    private double radius ;
    private String color ;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return (this.radius * 2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("radius: %f",this.radius, "color: %s",this.color);
    }
}
