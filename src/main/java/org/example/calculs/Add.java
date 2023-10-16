package org.example.calculs;

public class Add {

    int num1;
    int num2;


    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addTwoNumbers() {
        return num1 + num2;
    }

    @Override
    public String toString() {
        return "num1:" + num1 + "; num2:" + num2;
    }
}