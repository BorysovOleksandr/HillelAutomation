package org.example.Lesson8.pets;

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
