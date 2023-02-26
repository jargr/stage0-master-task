package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int n = numberToPrint;
        for (int i = 1; i < power; i++) {
            n *= numberToPrint;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
