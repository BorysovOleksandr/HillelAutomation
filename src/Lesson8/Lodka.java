package Lesson8;

public class Lodka extends Ships {

    public void floating(){
        System.out.println("I can float!!!");
    }

    public static void main(String[] args) {
        Lodka ship = new Lodka();
        ship.setShipType("Lodka");
        ship.setShipWeight(2);

    }

}
