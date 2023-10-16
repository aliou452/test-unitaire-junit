package org.example.calculs;

public class Calculator {

    int num1;
    int num2;


    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int divise() {
        return num1 / num2;
    }

    public static boolean isPair(int num) {
        return num % 2 == 0;
    }

    public int substract() {
        return num1 - num2;
    }

    @Override
    public String toString() {
        return "num1:" + num1 + "; num2:" + num2;
    }
}