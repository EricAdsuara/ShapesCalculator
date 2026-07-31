package ph.edu.lbycpob;

import java.util.List;

public class GPACalculator {

    public static double calculateGPA(List<CourseGrade> courses) {
        if (courses == null || courses.isEmpty()) {
            return 0.0;
        }

        double totalQualityPoints = 0.0;
        double totalUnits = 0.0;

        for (CourseGrade course : courses) {
            totalQualityPoints += course.getQualityPoints();
            totalUnits += course.getUnits();
        }

        return totalUnits == 0 ? 0.0 : totalQualityPoints / totalUnits;
    }

    public static double calculateTotalUnits(List<CourseGrade> courses) {
        double totalUnits = 0.0;
        for (CourseGrade course : courses) {
            totalUnits += course.getUnits();
        }
        return totalUnits;
    }
