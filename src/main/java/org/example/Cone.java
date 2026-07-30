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

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("[Error] Radius must be positive. Defaulting to 1.0.");
            this.radius = 1.0;
            return;
        }
        this.radius = radius;
    }

    public double getHeight() { return height; }
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