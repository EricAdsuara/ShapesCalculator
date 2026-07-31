package ph.edu.lbycpob;

public class ReportGenerator {

    public static void printStudentReport(Student student) {
        System.out.println("==============================================");
        System.out.println("            ACADEMIC GRADE REPORT             ");
        System.out.println("==============================================");
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Student Name : " + student.getName());
        System.out.println("----------------------------------------------");
        System.out.printf("%-15s %-10s %-10s\n", "Course Code", "Units", "Grade");
        System.out.println("----------------------------------------------");

        for (CourseGrade course : student.getCourses()) {
            System.out.printf("%-15s %-10.1f %-10.1f\n",
                    course.getCourseCode(),
                    course.getUnits(),
                    course.getGradePoint());
        }

        double totalUnits = GPACalculator.calculateTotalUnits(student.getCourses());
        double gpa = GPACalculator.calculateGPA(student.getCourses());

        System.out.println("----------------------------------------------");
        System.out.printf("Total Units Taken : %.1f\n", totalUnits);
        System.out.printf("Cumulative GPA    : %.4f\n", gpa);
        System.out.println("==============================================");
    }

