package com.Brunoyam.Module_5;

/*В массиве, состоящем из N вещественных элементов найти максимальный по модулю элемент массива.*/

public class Mod5Mid2 {
    public static void main(String[] args) {

        double[] number = {5, -2.5, 0, 1, 3.6, -5.1};

        double max = 0;

        for (double a : number) {
            if ( Math.abs(a) > max) {
                max = Math.abs(a);
            }
                    }
        System.out.println(max);
    }
}
