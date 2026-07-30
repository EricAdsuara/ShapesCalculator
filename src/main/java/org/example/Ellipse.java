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