package org.example.Lesson8.aviation;

public abstract class Aviation {
    protected String aviationType;
    protected int maxAltitude;

    public abstract void altitude();
    public void setAviationType(String aviationType){
        this.aviationType = aviationType;
    }
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

}