package ph.edu.lbycpob;

import java.util.List;

public class GPACalculator {

    public static double calculateGPA(List<CourseGrade> courses) {
        if (courses == null || courses.isEmpty()) {
            return 0.0;
        }