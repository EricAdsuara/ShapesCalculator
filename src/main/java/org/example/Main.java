package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== GEOMETRY CALCULATOR (2D + 3D) ===");
            System.out.println("1. Square        2. Rectangle    3. Circle");
            System.out.println("4. Ellipse       5. Triangle     6. Cube");
            System.out.println("7. Cuboid        8. Sphere       9. Cone");
            System.out.println("10. Cylinder    11. Exit");
            System.out.print("Select an option (1-11): ");

            choice = scanner.nextInt();
            if (choice == 11) break;

            switch (choice) {
                case 1:
                System.out.print("Should it be filled? (true/false): ");
                boolean f1 = scanner.nextBoolean();
                System.out.print("Enter side: ");
                new Square(scanner.nextDouble(), f1).displayInfo();
                break;
                case 2:
                    System.out.print("Should it be filled? (true/false): ");
                    boolean f2 = scanner.nextBoolean();
                    System.out.print("Enter length: ");
                    double l = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    new Rectangle(l, scanner.nextDouble(), f2).displayInfo();
                    break;
                case 3:
                    System.out.print("Should it be filled? (true/false): ");
                    boolean f3 = scanner.nextBoolean();
                    System.out.print("Enter radius: ");
                    new Circle(scanner.nextDouble(), f3).displayInfo();
                    break;
                case 4:
                    System.out.print("Should it be filled? (true/false): ");
                    boolean f4 = scanner.nextBoolean();
                    System.out.print("Enter semi-major axis: ");
                    double ma = scanner.nextDouble();
                    System.out.print("Enter semi-minor axis: ");
                    new Ellipse(ma, scanner.nextDouble(), f4).displayInfo();
                    break;
                case 5:
                    System.out.print("Should it be filled? (true/false): ");
                    boolean f5 = scanner.nextBoolean();
                    System.out.print("Enter side A: ");
                    double sa = scanner.nextDouble();
                    System.out.print("Enter side B: ");
                    double sb = scanner.nextDouble();
                    System.out.print("Enter side C: ");
                    new Triangle(sa, sb, scanner.nextDouble(), f5).displayInfo();
                    break;
                case 6:
                    System.out.print("Enter cube side: ");
                    new Cube(scanner.nextDouble()).displayInfo();
                    break;
                case 7:
                    System.out.print("Enter length: ");
                    double cl = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double cw = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    new Cuboid(cl, cw, scanner.nextDouble()).displayInfo();
                    break;
                case 8:
                    System.out.print("Enter sphere radius: ");
                    new Sphere(scanner.nextDouble()).displayInfo();
                    break;
                case 9:
                    System.out.print("Enter cone radius: ");
                    double cr = scanner.nextDouble();
                    System.out.print("Enter cone height: ");
                    new Cone(cr, scanner.nextDouble()).displayInfo();
                    break;
                case 10:
                    System.out.print("Enter cylinder radius: ");
                    double cylR = scanner.nextDouble();
                    System.out.print("Enter cylinder height: ");
                    new Cylinder(cylR, scanner.nextDouble()).displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 11);

        System.out.println("Exiting application.");
        scanner.close();
    }
}
