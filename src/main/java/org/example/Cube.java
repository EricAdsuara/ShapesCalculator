package org.example;

public class Cube {
    private double side;

    public Cube() {
        this(1.0);
    }

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.out.println("[Error] Side must be positive. Defaulting to 1.0.");
            this.side = 1.0;
            return;
        }
        this.side = side;
    }

    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    public void displayInfo() {
        System.out.println("\n--- Cube Info ---");
        System.out.println("Side: " + side);
        System.out.println("Surface Area: " + calculateSurfaceArea());
        System.out.println("Volume: " + calculateVolume());
    }
}