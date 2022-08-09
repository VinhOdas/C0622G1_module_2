package ss7_abstract_class_interface.exercise.interface_colorable.model;

public abstract class Shape {
    private String color  ;
    private boolean filled ;

    public Shape() {
        color = "green";
        filled = true;
    };

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    @Override
    public String toString() {if (this.filled) {
        return String.format("A Shape with color of %s",getColor()," and filled");
    }
    else return String.format("not filled");
    }

}
