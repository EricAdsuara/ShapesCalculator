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

    public double getLength() { return length; }
    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("[Error] Length must be positive. Defaulting to 1.0.");
            this.length = 1.0;
            return;
        }
        this.length = length;
    }
    public double getWidth() { return width; }
    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("[Error] Width must be positive. Defaulting to 1.0.");
            this.width = 1.0;
            return;
        }
        this.width = width;
    }
