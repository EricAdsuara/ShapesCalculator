package ph.edu.lbycpob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- DLSU Grade Tracker ---");
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);

        System.out.print("How many courses to add? ");
        int numCourses = scanner.nextInt();

        for (int i = 0; i < numCourses; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");
            System.out.print("Course Code: ");
            String code = scanner.next();

            double units;
            do {
                System.out.print("Units (e.g. 3.0): ");
                units = scanner.nextDouble();
                if (!GradeValidator.isValidUnits(units)) {
                    System.out.println("[Error] Invalid units. Must be > 0 and <= 12.");
                }
            } while (!GradeValidator.isValidUnits(units));

            double grade;
            do {
                System.out.print("Grade Point (0.0 - 4.0): ");
                grade = scanner.nextDouble();
                if (!GradeValidator.isValidGradePoint(grade)) {
                    System.out.println("[Error] Invalid DLSU grade scale point.");
                }
            } while (!GradeValidator.isValidGradePoint(grade));

            student.addCourse(new CourseGrade(code, units, grade));
        }

        ReportGenerator.printStudentReport(student);
        scanner.close();
    }
}