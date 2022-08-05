package ss5_Access_Modifier.practice.car;

public class Car {
    private String name ;
    private String engine;
    public static int numbersOfCar;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numbersOfCar ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumbersOfCar() {
        return numbersOfCar;
    }

    public static void setNumbersOfCar(int numbersOfCar) {
        Car.numbersOfCar = numbersOfCar;
    }
}
