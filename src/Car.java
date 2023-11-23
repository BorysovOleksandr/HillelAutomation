public class Car {
    // fields
    String type;
    String model;
    String color;
    int speed;

    // constructor
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    Car focus = new Car("Ford", "Focus", "red");
    Car auris = new Car("Toyota", "Auris", "blue");
    Car golf = new Car("Volkswagen", "Golf", "green"); //это ОБЬЕКТЫ класса

    // methods
    int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }
}
