package Lesson8.ships;

public class MainShips {
    public static void main(String[] args) {
        Ship ship1 = new Kater();
        ship1.setShipType("Kater");
        ship1.setShipSpeed(20);
        ship1.velocity();

        Ship ship2 = new Lodka();
        ship2.setShipType("Lodka");
        ship2.setShipSpeed(3);
        ship2.velocity();

        Ship ship3 = new Barge();
        ship3.setShipType("Barge");
        ship3.setShipSpeed(0);
        ship3.velocity();
    }
}
