package org.example.Lesson8.fishes;

public abstract class Fish {
    protected String fishName;
    protected String color;
    protected int weight;

    public void swim() {
        System.out.println("I can swim");
    }

    public void info(){
        System.out.println("Name - " + fishName);
        System.out.println("Color - " + color);
        System.out.println("Weight - " + weight);
    }

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

