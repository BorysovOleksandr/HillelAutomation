package Lesson8.fishes;

public class MainFishes {
    public static void main(String[] args) {

        Fish fish1 = new Schuka();
        fish1.setFishName("Schuka");
        fish1.setColor("green");
        fish1.setWeight(6);
        fish1.swim();
        fish1.info();

        Fish fish2 = new Karasik();
        fish2.setFishName("Karasik");
        fish2.setColor("silver");
        fish2.setWeight(1);
        fish2.swim();
        fish2.info();

        Fish fish3 = new Som();
        fish3.setFishName("Som");
        fish3.setColor("grey");
        fish3.setWeight(10);
        fish3.swim();
        fish3.info();

    }

}
