package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println(dividend == (dividend/divider)*divider ? "can be divided completely" : "cannot be divided completely" );
        }
    }

}
