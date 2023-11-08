package Lesson7.Quadrangle;

import Lesson7.Quadrangle.Quadrangle;

public class Rectangle extends Quadrangle {
    private int getSideA (){
        return super.sideA;
    }
    private int getSideB (){
        return super.sideB;
    }
    public Rectangle(int sideA, int sideB){
        super(int sideA, int sideB, int sideC, int sideD);
    }
}
