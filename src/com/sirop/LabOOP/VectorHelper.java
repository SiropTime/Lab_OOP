package com.sirop.LabOOP;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class VectorHelper {

    private static ArrayList<Vector> vectorsList;

    VectorHelper() {
        this.run();
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        vectorsList = new ArrayList<Vector>();
        System.out.println("Лабораторная по ООП.\n Версия 3 лабы\nСоздайте множество векторов" +
                " по заданному типу:\n" +
                "Вначале вы пишите размерность вектора (2 или 3), затем соответствующее количество координат для точки начала и точки конца\n" +
                "Или вы можете написать любое другое число в первый раз, и программа создаст случайный массив случайного размера");
        System.out.println("Для прекращения ввода напишите 0");
        int answer;
        Random r = new Random();
        // Создание векторов
        while (true) {
            answer = scan.nextInt();
            // Создание двумерного вектора
            if (answer == 2) {
                Point bp = new Point(2, new float[]{scan.nextFloat(), scan.nextFloat()});
                Point ep = new Point(2, new float[]{scan.nextFloat(), scan.nextFloat()});
                Vector2D v = new Vector2D(bp, ep);
                vectorsList.add(v);
            // Создание трёхмерного вектора
            } else if (answer == 3) {
                Point bp = new Point(3, new float[]{scan.nextFloat(), scan.nextFloat(), scan.nextFloat()});
                Point ep = new Point(3, new float[]{scan.nextFloat(), scan.nextFloat(), scan.nextFloat()});
                Vector3D v = new Vector3D(bp, ep);
                vectorsList.add(v);
            // Для выхода из подпрограммы
            } else if (answer == 0) {
                break;
            // Создание рандомного количества рандомных векторов
            } else {
                int end = r.nextInt(100);
                for (int i = 0; i < end; i++) {
                    int dimension = r.nextInt(2) + 2; // [0; 2) + 2 = [2; 4), что нам, собственно и нужно
                    float[] beginCoords = new float[dimension];
                    float[] endCoords = new float[dimension];
                    for (int j = 0; j < dimension; j++) {
                        beginCoords[j] = r.nextInt() * 0.001f;
                        endCoords[j] = r.nextInt() * 0.001f;
                    }
                    Point bp = new Point(dimension, beginCoords);
                    Point ep = new Point(dimension, endCoords);
                    Vector v;
                    if (dimension == 2) {
                        v = new Vector2D(bp, ep);
                        vectorsList.add(v);
                    } else if (dimension == 3) {
                        v = new Vector3D(bp, ep);
                        vectorsList.add(v);
                    }
                }
                break;
            }
        }
        System.out.println("Выберите одну из доступных функций:\n 0 - Выход из программы\n" +
                " 1 - Вывести все вектора\n 2 - Вывести начальные точки векторов\n" +
                " 3 - Вывести конечные точки векторов");
        while (true) {
            System.out.print("Введите ответ: ");
            answer = scan.nextInt();
            if (answer == 0) {
                System.out.println("Пока!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            } else if (answer == 1) {
                System.out.println("Вектора:\n");
                for (int i = 0; i < vectorsList.size(); i++) {
                    vectorsList.get(i).printVector();
                }
            } else if (answer == 2) {
                System.out.println("Начальные точки векторов:\n");
                for (int i = 0; i < vectorsList.size(); i++) {
                    vectorsList.get(i).getBeginPoint().printPoint();
                }
            } else if (answer == 3) {
                System.out.println("Конечные точки векторов:\n");
                for (int i = 0; i < vectorsList.size(); i++) {
                    vectorsList.get(i).getEndPoint().printPoint();
                }
            }
        }

    }

}
