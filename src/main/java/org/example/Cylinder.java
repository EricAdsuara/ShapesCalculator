package org.example;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        this(1.0, 2.0);
    }

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }
