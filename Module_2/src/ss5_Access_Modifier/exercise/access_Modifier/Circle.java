package ss5_Access_Modifier.exercise.access_Modifier;

public class Circle {
    private double radius = 1.0; // bán kính
    private String color = "Red"; // màu sắc

    public Circle() {//Hàm tạo không tham số
        // Hình tròn
    }

    public Circle(double radius) {//Hàm tạo có tham số là radius
        this.radius = radius;
    }

    public double getRadius() { //getter phương thúc radius
        return radius;
    }
    public double getArea(){ // getter phương thức Area
        // Diện tích hình tròn
        return radius * radius * Math.PI;
    }
}
