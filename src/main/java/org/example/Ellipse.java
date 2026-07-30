package org.example;

public class Ellipse {
    private double semiMajorAxis;
    private double semiMinorAxis;
    private boolean filled;

    public Ellipse() {
        this(2.0, 1.0, true);
    }
