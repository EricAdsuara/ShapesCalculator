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

    public double getSemiMajorAxis() { return semiMajorAxis; }
    public void setSemiMajorAxis(double a) {
        if (a <= 0) {
            System.out.println("[Error] Major axis must be positive. Defaulting to 1.0.");
            this.semiMajorAxis = 1.0;
            return;
        }
        this.semiMajorAxis = a;
    }
    public double getSemiMinorAxis() { return semiMinorAxis; }
    public void setSemiMinorAxis(double b) {
        if (b <= 0) {
            System.out.println("[Error] Minor axis must be positive. Defaulting to 1.0.");
            this.semiMinorAxis = 1.0;
            return;
        }
        this.semiMinorAxis = b;
    }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double calculateArea() { return Math.PI * semiMajorAxis * semiMinorAxis; }

    public double calculatePerimeter() {
        double a = semiMajorAxis;
        double b = semiMinorAxis;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public void displayInfo() {
        System.out.println("\n--- Ellipse Info ---");
        System.out.println("Semi-Major Axis: " + semiMajorAxis + ", Semi-Minor Axis: " + semiMinorAxis);
        System.out.println("Area: " + calculateArea());
        System.out.println("Approx. Perimeter: " + calculatePerimeter());
        draw();
    }

    public void draw() {
        System.out.println("Display:");
        if (filled) {
            System.out.println("  *****  \n ******* \n  *****  ");
        }