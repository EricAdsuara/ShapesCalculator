package ph.edu.lbycpob;

public class GradeValidator {
    private static final double[] VALID_GRADES = {0.0, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0};

    public static boolean isValidGradePoint(double grade) {
        for (double validGrade : VALID_GRADES) {
            if (Double.compare(validGrade, grade) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidUnits(double units) {
        return units > 0 && units <= 12.0;
    }
