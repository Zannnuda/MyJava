package com.company;

import java.util.Calendar;

public class Calculator {

    double a;
    double b;


    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subs() {
        return a - b;
    }

    public double mult() {
        return a * b;
    }

    public double div() {
        return a / b;
    }
}