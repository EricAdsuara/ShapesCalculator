package ph.edu.lbycpob;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private final List<CourseGrade> courses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public List<CourseGrade> getCourses() { return courses; }

    public void addCourse(CourseGrade course) {
        if (course != null) {
            courses.add(course);
        }
    }
}