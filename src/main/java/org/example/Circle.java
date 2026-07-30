package org.example;

public class Circle {
    private double radius;
    private boolean filled;

    public Circle() {
        this(1.0, true);
    }

    public Circle(double radius, boolean filled) {
        setRadius(radius);
        this.filled = filled;
    }
