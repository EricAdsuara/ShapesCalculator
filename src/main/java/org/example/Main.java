import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice;

        do {
            System.out.println("\n=== 2D SHAPES CALCULATOR ===");
            System.out.println("1. Square\n2. Rectangle\n3. Circle\n4. Ellipse\n5. Triangle\n6. Exit");
            Sytem.out.print("Select an option (1-6) ");

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
                    new Rectangle(l, scanner.nextDouble(), filled).displayInfo();
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    new Circle(scanner.nextDouble(), filled).displayInfo();
                    break;
        }
    }
}
