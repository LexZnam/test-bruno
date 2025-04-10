package com.Brunoyam.Module_4;

public class Mod4Med3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        int c = 32;

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
