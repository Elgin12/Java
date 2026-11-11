package university;
public class course {
    private final String courseCode;
    private String title;
    private int credits;
    private String semester;

    public course(String courseCode, String title, int credits, String semester) {
        if (courseCode == null || courseCode.isBlank()) {
            throw new IllegalArgumentException("Course code cannot be blank");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        if (credits < 1 || credits > 6) {
            throw new IllegalArgumentException("Credits must be between 1 and 6");
        }
        if (semester == null || semester.isBlank()) {
            throw new IllegalArgumentException("Semester cannot be blank");
        }
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
        this.semester = semester;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits < 1 || credits > 6) {
            throw new IllegalArgumentException("Credits must be between 1 and 6");
        }
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String fullName() {
        return courseCode + ": " + title;
    }

    public boolean isMajorCourse() {
        return credits >= 3;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", title='" + title + '\'' +
                ", credits=" + credits +
                ", semester='" + semester + '\'' +
                '}';
    }
}
