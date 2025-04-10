package com.Brunoyam.Module_4;



import java.util.Scanner;

public class Mod4Easy1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;

        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }

        System.out.println(y);
    }
}
