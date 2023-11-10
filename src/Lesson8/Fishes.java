package Lesson8;

import java.awt.*;

public abstract class Fishes {
    protected String fishName;
    protected String color;
    protected int weight;

    public abstract void swim();


    public void setFishName(String fishName) {
        this.fishName = fishName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

