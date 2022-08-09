package ss7_abstract_class_interface.practice.animal_and_interface_dible.controller;

import ss7_abstract_class_interface.practice.animal_and_interface_dible.model.Animal;
import ss7_abstract_class_interface.practice.animal_and_interface_dible.model.Chicken;
import ss7_abstract_class_interface.practice.animal_and_interface_dible.model.Tiger;

public class MainController {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}
