package ss7_abstract_class_interface.practice.interface_comparable.model;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width= %f", getWidth(), "and length= %f", getHeight(), "which is a subclass of %s", super.toString());
    }
}
