package org.example;

import org.example.calculs.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator add = new Calculator(2, 5);

        System.out.println("Addition: " + add.add());
        System.out.println("ToString method: " + add);
    }
}