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

    public ClassFan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 10) {
            System.out.println("Yêu cầu nhập lại");
        } else {
            this.speed = speed;
        }
    }


    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String getSpeed() {
        switch (this.speed) {
            case 1:
                return "slow";
            case 2:
                return "medium";
            case 3:
                return "hard";
            default:
                return "Đéo";
        }

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return String.format("Speed: %s Color: %s Radius: %f fan is on", getSpeed(), getColor(), getRadius());
        } else {
            return String.format(" Color: %s Radius: %f fan is off", getColor(), getRadius());
        }
    }
}
