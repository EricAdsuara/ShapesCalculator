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
