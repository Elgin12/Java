import java.time.LocalDate;

public class Student {
    private String studentId;
    private String name;
    private double gpa;
    private int enrollment;
    private int currentYear = LocalDate.now().getYear();

    public Student(String studentId, String name, double gpa, int enrollment) {
        this.studentId = studentId;
        this.name = name;
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("Gpa not valid. It should be between 0 and 4");
        } else {
            System.out.println("Gpa is valid");
            this.gpa = gpa;
        }
        if (enrollment < 2000 || enrollment > currentYear) {
            throw new IllegalArgumentException("Invalid Year! Year should be from 2000 to now");
        }
        this.enrollment = enrollment;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA");
        }
    }

    public String academicStanding() {
        if (gpa >= 2.0) {
            return "Good standing";
        } else if (gpa >= 1.5) {
            return "Academic Probation";
        } else {
            return "Academic Warning";
        }
    }

    public int yearsEnrolled() {
        return currentYear - enrollment;
    }

    @Override
    public String toString() {
        return "StudentId: " + studentId + "\nName: " + name + "\nGpa: " + gpa + "\nEnrollment: " + enrollment;
    }
}
