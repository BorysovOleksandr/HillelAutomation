package Lesson8.ships;

public abstract class Ship {
    protected String shipType;
    protected int shipSpeed;

    public abstract void velocity();
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
    public void setShipSpeed(int shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

}
