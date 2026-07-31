package org.example;

public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid() {
        this(2.0, 1.0, 1.0);
    }

    public Cuboid(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("[Error] Height must be positive. Defaulting to 1.0.");
            this.height = 1.0;
            return;
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * (length * width + width * height + length * height);
    }

    public double calculateVolume() {
        return length * width * height;
    }

    public void displayInfo() {
        System.out.println("\n--- Cuboid Info ---");
        System.out.println("Dimensions: " + length + " x " + width + " x " + height);
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}
