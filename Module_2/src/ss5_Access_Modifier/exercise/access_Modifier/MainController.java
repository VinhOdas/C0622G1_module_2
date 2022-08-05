package ss5_Access_Modifier.exercise.access_Modifier;

public class MainController {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        System.out.println("Bán kính của hình tròn là: " + circle1.getRadius());
        System.out.printf("Diện tích của hình tròn là: ", circle1.getArea());

    }

}
