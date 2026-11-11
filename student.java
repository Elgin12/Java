package university;
public class student {
    private final String studentId;
    private String name;
    private double gpa;
    private final int enrolmentYear;

    public student(String studentId, String name, int enrolmentYear) {
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Student ID cannot be blank");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
        this.enrolmentYear = enrolmentYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getEnrolmentYear() {
        return enrolmentYear;
    }

    public void updateGpa(double newGpa) {
        if (newGpa < 0.0 || newGpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = newGpa;
    }

    public String academicStanding() {
        if (gpa >= 2.0) {
            return "Good standing";
        } else if (gpa >= 1.5) {
            return "Academic probation";
        } else {
            return "Academic warning";
        }
    }

    public int yearsEnrolled(int currentYear) {
        return currentYear - enrolmentYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", enrolmentYear=" + enrolmentYear +
                '}';
    }
}
