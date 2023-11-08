package Lesson7.Quadrangle;

public class Parallelogram extends Quadrangle {

    private int getSideA (){
        return super.sideA;
    }
    private int getSideB (){
        return super.sideB;
    }
    public Parallelogram(int sideA, int sideB){
        super(int sideA, int sideB, int sideC, int sideD);
    }

}
