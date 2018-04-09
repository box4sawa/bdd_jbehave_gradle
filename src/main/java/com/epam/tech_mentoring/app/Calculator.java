package com.epam.tech_mentoring.app;


public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0)
            throw new IllegalArgumentException("Division by zero is inappropriate");
        return a / b;
    }
}
