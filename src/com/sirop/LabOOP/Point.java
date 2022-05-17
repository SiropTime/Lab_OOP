package com.sirop.LabOOP;

public class Point {
    public float[] coords;

    Point(int dimension, float[] c) {
        this.coords = new float[dimension];
        for (int i = 0; i < dimension; i++) {
            try {
                this.coords[i] = c[i];
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Массив точек, переданный в массив, превышает его размерность");
            }

        }
    }

    public void printPoint() {
        if (this.coords.length == 2) {
            System.out.println("Точка: (" + this.coords[0] + ", " + this.coords[1] + ")");
        } else if (this.coords.length == 3) {
            System.out.println("Точка: (" + this.coords[0] + ", " + this.coords[1] + ", " + this.coords[2] + ")");
        }
    }
}
