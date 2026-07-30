package org.example;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private boolean filled;

    public Triangle() {
        this(3.0, 4.0, 5.0, true);
    }

    public Triangle(double a, double b, double c, boolean filled) {
        setSides(a, b, c);
        this.filled = filled;
    }

    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }