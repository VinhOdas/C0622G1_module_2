package ss5_Access_Modifier.practice.car;

public class MainController {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Fox");
        System.out.println("Tên xe: " + car1.getName());
        System.out.println("Động cơ: " + car1.getEngine());
        System.out.println("Vị trí xe: " + Car.numbersOfCar);
        Car car2 = new Car("HonDa", "Fox");
        System.out.println("Tên xe: " + car2.getName());
        System.out.println("Động cơ: " + car2.getEngine());
        System.out.println("Vị trí xe: " + Car.numbersOfCar);
    }

}

