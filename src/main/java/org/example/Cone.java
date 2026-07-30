package org.example;

public class Cone {
    private double radius;
    private double height;

    public Cone() {
        this(1.0, 2.0);
    }

    public Cone(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }