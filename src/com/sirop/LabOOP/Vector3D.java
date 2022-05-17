package com.sirop.LabOOP;

public class Vector3D extends Vector {

    Vector3D(Point beginPoint, Point endPoint) {
        this.coords = new float[3];
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
        this.coords[0] = endPoint.coords[0] - beginPoint.coords[0];
        this.coords[1] = endPoint.coords[1] - beginPoint.coords[1];
        this.coords[2] = endPoint.coords[2] - beginPoint.coords[2];

    }

    @Override
    public float[] getCoordinates() {
        return this.coords;
    }

    @Override
    public Point getBeginPoint() {
        return this.beginPoint;
    }

    @Override
    public Point getEndPoint() {
        return this.endPoint;
    }

    @Override
    public void printVector() {
        System.out.println("Вектор: (" + this.coords[0] + ", " + this.coords[1] + ", " + this.coords[2] + ")");
    }
}
