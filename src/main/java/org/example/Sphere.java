package org.example;

public class Sphere {
    private double radius;

    public Sphere() {
        this(1.0);
    }

    public Sphere(double radius) {
        setRadius(radius);
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

    public double calculateSurfaceArea() { return 4 * Math.PI * radius * radius; }
    public double calculateVolume() { return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); }
