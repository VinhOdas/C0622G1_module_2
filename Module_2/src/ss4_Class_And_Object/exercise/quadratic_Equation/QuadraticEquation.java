package ss4_Class_And_Object.exercise.quadratic_Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double GetDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-(this.b) + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / 2 * this.a;
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }
    public String display() {

        return "QuadraticEquation{" + "a=" + a + ", b=" + b + ", c=" + c + "}";
    }


}
