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
                    System.out.print("Enter radius: ");
                    new Circle(scanner.nextDouble(), filled).displayInfo();
                    break;
                case 4:
                    System.out.print("Enter semi-major axis: ");
                    double ma = scanner.nextDouble();
                    System.out.print("Enter semi-minor axis: ");
                    new Ellipse(ma, scanner.nextDouble(), filled).displayInfo();
                    break;
                case 5:
                    System.out.print("Enter side A, B, C: ");
                    new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), filled).displayInfo();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        System.out.println("Exiting application.");
        scanner.close();
        }
    }
