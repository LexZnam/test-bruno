package com.Brunoyam.module_3;

public class Mod3Hard2 {
    public static void main(String[] args) {
        //координаты вершин условные--
        double ax = 3;
        double ay = 4;
        double bx = 0;
        double by = -3;
        double cx = -1;
        double cy = -1;
        //--координаты вершин
        //найти длинну отрезков--
        double a = Math.sqrt((Math.pow((bx - cx), 2) + Math.pow((by - cy), 2)));
        double b = Math.sqrt((Math.pow((cx - ax), 2) + Math.pow((cy - ay), 2)));
        double c = Math.sqrt((Math.pow((ax - bx), 2) + Math.pow((ay - by), 2)));
        //--найти длинну отрезков
        //Формула Герона (площадь треугольника по 3м сторонам--
        double p = (a + b + c) / 2; // полупериметр
        double square = (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        //--Формула Герона
        System.out.println(square);
    }
}
