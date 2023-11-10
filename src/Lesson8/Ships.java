package Lesson8;

public abstract class Ships {
    protected String shipType;
    protected int shipWeight;

    public abstract void floating();
    public void setShipType(String shipType) {
        this.shipType = shipType;
    }
    public void setShipWeight(int shipWeight) {
        this.shipWeight = shipWeight;
    }

}
