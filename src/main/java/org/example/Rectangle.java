package org.example;
public class Rectangle {
    private double length;
    private double width;
    private boolean filled;

    public Rectangle() {
        this(2.0, 1.0, true);
    }

    public Rectangle(double length, double width, boolean filled) {
        setLength(length);
        setWidth(width);
        this.filled = filled;
    }
