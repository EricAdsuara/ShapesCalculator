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