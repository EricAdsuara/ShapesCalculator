package org.example;

public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid() {
        this(2.0, 1.0, 1.0);
    }

    public Cuboid(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
