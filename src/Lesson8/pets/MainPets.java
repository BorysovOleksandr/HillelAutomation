package Lesson8.pets;
import Lesson8.pets.Cat;
import Lesson8.pets.Dog;
import Lesson8.pets.Pet;
public class MainPets {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        pet1.sound();
        Pet pet2 = new Dog();
        pet2.sound();
        Pet pet3 = new Hamster();
        pet3.sound();
    }
}
