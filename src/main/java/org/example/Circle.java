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
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double calculateArea() { return Math.PI * radius * radius; }
    public double calculatePerimeter() { return 2 * Math.PI * radius; }