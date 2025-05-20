package com.Brunoyam.Module_6;

import com.Medusa.Calculator;

//КАЛЬКУЛЯТОР

import java.util.Scanner;

public class Mod6Mid1 {
    public static void main(String[] args) {

        System.out.println("Введите сначала математическое действие на выбор: +, -, *, /.");
        System.out.println("Затем два аргумента");

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        String BasicMath = scan.nextLine();
        double num1 = scan.nextInt();
        double num2 = scan.nextInt();

        switch (BasicMath) {
            case ("+"): {
                System.out.println(calc.Subtraction(num1, num2));
                break;
            }
            case ("-"): {
                System.out.println(calc.Addition(num1, num2));
                break;
            }
            case ("*"): {
                System.out.println(calc.Multiplication(num1, num2));
                break;
            }
            case ("/"): {
                System.out.println(calc.Division(num1, num2));
                break;
            }
            default: {
                System.out.println("Неверное значение");
            }
        }

    }

    public static class Calculator {
        public double Addition(double num1, double num2) {
            return num1 + num2;
        }

        public double Subtraction(double num1, double num2) {
            return num1 - num2;
        }

        public double Multiplication(double num1, double num2) {
            return num1 * num2;
        }

        public double Division(double num1, double num2) {
            return num1 / num2;
        }

    }

}
