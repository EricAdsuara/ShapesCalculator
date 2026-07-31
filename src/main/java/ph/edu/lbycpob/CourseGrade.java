package ph.edu.lbycpob;

public class CourseGrade {
    private String courseCode;
    private double units;
    private double gradePoint;

    public CourseGrade(String courseCode, double units, double gradePoint) {
        setCourseCode(courseCode);
        setUnits(units);
        setGradePoint(gradePoint);
    }
