package org.example;

import org.example.calculs.Add;

public class Main {
    public static void main(String[] args) {

        Add add = new Add(2, 5);

        System.out.println("Addition: " + add.addTwoNumbers());
        System.out.println("ToString method: " + add);
    }
}