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

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
