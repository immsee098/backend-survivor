package com.hsy.api.rest.demo;

public class NewtonMethod {
    private static final double epsilon = 0.0001;

    public double sqrtIter(double guess, double x) {
        if (goodEnough(guess, x)) {
            return guess;
        }

        return sqrtIter(improve(guess, x), x);
    }

    public boolean goodEnough(double guess, double x) {
        double epsilon = 0.0001;

        if (guess < 0) {
            return false;
        }
        return Math.abs(Math.pow(guess, 2) - x) < epsilon;
    }

    public double improve(double guess, double x) {
        return (guess + (x / guess)) / 2;
    }

    public double average(double x, double y) {
        return (x + y) / 2;
    }

    public double sqrt(double x) {
        return sqrtIter(1, x);
    }
}
