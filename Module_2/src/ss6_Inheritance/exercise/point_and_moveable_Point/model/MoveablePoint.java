package ss6_Inheritance.exercise.point_and_moveable_Point.model;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()} ;
    }

    @Override
    public String toString() {
        return String.format("%s: xspeed %f\n yspeed %f\n",super.toString(),getxSpeed(),getySpeed());
    }
    public MoveablePoint move(){
        this.setX(this.getX()+this.getxSpeed());
        this.setY(this.getY()+this.getySpeed());
        return this;
    }
}
