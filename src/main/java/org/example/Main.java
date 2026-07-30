package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice;

        do {
            System.out.println("\n=== 2D SHAPES CALCULATOR ===");
            System.out.println("1. Square\n2. Rectangle\n3. Circle\n4. Ellipse\n5. Triangle\n6. Exit");
            System.out.print("Select an option (1-6): ");

            choice = scanner.nextInt();
            if (choice == 6) break;

            System.out.print("Should the shape be filled? (true/false): ");
            boolean filled = scanner.nextBoolean();

            switch (choice) {
                case 1:
                    System.out.print("Enter side: ");
                    new Square(scanner.nextDouble(), filled).displayInfo();
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double l = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double w = scanner.nextDouble();
                    new Rectangle(l, w, filled).displayInfo();
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
