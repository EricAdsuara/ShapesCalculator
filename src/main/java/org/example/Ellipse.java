package org.example;

public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;
    private boolean filled;

    public Ellipse() {
        this(2.0, 1.0, true);
    }

    public Ellipse(double semiMajorAxis, double semiMinorAxis, boolean filled) {
        setSemiMajorAxis(semiMajorAxis);
        setSemiMinorAxis(semiMinorAxis);
        this.filled = filled;
    }
