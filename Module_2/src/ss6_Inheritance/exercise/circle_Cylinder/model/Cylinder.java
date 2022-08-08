package ss6_Inheritance.exercise.circle_Cylinder.model;

import ss6_Inheritance.exercise.circle_Cylinder.model.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public  Cylinder(){

    }
    public double getVolume(){
        return getRadius() * getRadius() *Math.PI * this.height  ;
    }

    @Override
    public String toString() {
        return String.format("height: %f",this.height,"Cỉcle %s",super.toString());
    }

}
