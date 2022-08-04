package ss4_Class_And_Object.exercise.class_Fan;

public class ClassFan {
    final int slow = 1;
    final int medium = 2;
    final int hard = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public ClassFan() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
     public void setSpeed(int speed){
        this.speed = speed;
    }
    public void  setOn(boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void  setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on == true){
            return String.format("speed: "+this.speed+" color: "+this.color + "radius: " + this.radius + "fan is on" );
        }
        else {
            return String.format("speed: "+this.speed+" color: "+this.color + "radius: " + this.radius + "fan is off" );
        }
    }
}
