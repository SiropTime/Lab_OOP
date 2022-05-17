package com.sirop.LabOOP;

public abstract class Vector {
    protected float[] coords;
    protected Point beginPoint;
    protected Point endPoint;

    public abstract float[] getCoordinates();
    public abstract Point getBeginPoint();
    public abstract Point getEndPoint();
    public abstract void printVector();
}
