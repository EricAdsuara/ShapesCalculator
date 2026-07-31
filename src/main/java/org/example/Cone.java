package org.example;

public class Cone {
    private double radius;
    private double height;

    public Cone() {
        this(1.0, 2.0);
    }

    public Cone(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("[Error] Radius must be positive. Defaulting to 1.0.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
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

    public double calculateSlantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    public double calculateSurfaceArea() {
        double l = calculateSlantHeight();
        return Math.PI * radius * (radius + l);
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public void displayInfo() {
        System.out.println("\n--- Cone Info ---");
        System.out.println("Radius: " + radius + ", Height: " + height);
        System.out.println("Slant Height (l): " + calculateSlantHeight());
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}