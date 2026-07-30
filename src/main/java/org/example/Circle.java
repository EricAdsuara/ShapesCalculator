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

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("[Error] Radius must be positive. Defaulting to 1.0.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }