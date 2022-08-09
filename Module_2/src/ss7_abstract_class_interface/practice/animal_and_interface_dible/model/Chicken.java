package ss7_abstract_class_interface.practice.animal_and_interface_dible.model;

public class Chicken extends Animal implements Edible  {
    @Override
    public String howToEat() {
        return "cho đi tắm nắng";
    }

    @Override
    public String makeSound() {
        return " giang hú";
    }

}
