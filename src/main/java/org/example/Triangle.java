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

    public void setSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("[Error] Invalid triangle sides. Setting default right triangle (3, 4, 5).");
            this.sideA = 3.0;
            this.sideB = 4.0;
            this.sideC = 5.0;
            return;
        }
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double calculatePerimeter() { return sideA + sideB + sideC; }

    public double calculateArea() {
        double s = calculatePerimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public void displayInfo() {
        System.out.println("\n--- Triangle Info ---");
        System.out.println("Sides: " + sideA + ", " + sideB + ", " + sideC);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        draw();
    }

    public void draw() {
        System.out.println("Display:");
        if (filled) {
            System.out.println("   *   \n  ***  \n ***** \n*******");
        } else {
            System.out.println("   *   \n  * *  \n *   * \n*******");
        }
    }
}
