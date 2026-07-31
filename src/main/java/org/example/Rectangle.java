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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("[Error] Length must be positive. Defaulting to 1.0.");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("[Error] Width must be positive. Defaulting to 1.0.");
            this.width = 1.0;
            return;
        }
        this.width = width;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("\n--- Rectangle Info ---");
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        draw();
    }

    public void draw() {
        System.out.println("Display:");
        int rows = 3, cols = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (filled || i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}