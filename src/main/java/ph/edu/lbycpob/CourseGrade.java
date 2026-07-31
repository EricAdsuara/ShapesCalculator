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

    public double getUnits() { return units; }
    public void setUnits(double units) {
        if (units <= 0) {
            throw new IllegalArgumentException("Units must be greater than 0.");
        }
        this.units = units;
    }

    public double getGradePoint() { return gradePoint; }
    public void setGradePoint(double gradePoint) {
        if (!GradeValidator.isValidGradePoint(gradePoint)) {
            throw new IllegalArgumentException("Invalid DLSU grade point value.");
        }
        this.gradePoint = gradePoint;
    }