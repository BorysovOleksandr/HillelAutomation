package org.example.Lesson8.aviation;

public class MainAviation {
    public static void main(String[] args) {
        Aviation aviation1 = new Plane();
        aviation1.setAviationType("Plane");
        aviation1.setMaxAltitude(10000);
        aviation1.altitude();

        Aviation aviation2 = new Helicopter();
        aviation2.setAviationType("Helicopter");
        aviation2.setMaxAltitude(4000);
        aviation2.altitude();

        Aviation aviation3 = new Balloon();
        aviation3.setAviationType("Balloon");
        aviation3.setMaxAltitude(300000);
        aviation3.altitude();
    }
}
