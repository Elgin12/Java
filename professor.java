package university;
public class professor {
    private final String employeeId;
    private String name;
    private String specialisation;
    private int yearsOfExperience;

    public professor(String employeeId, String name, String specialisation, int yearsOfExperience) {
        if (employeeId == null || employeeId.isBlank()) {
            throw new IllegalArgumentException("Employee ID cannot be blank");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.specialisation = specialisation;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeId() {
        return employeeId;
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

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void completeAnotherYear() {
        this.yearsOfExperience++;
    }

    public boolean isExperienced() {
        return this.yearsOfExperience > 5;
    }

    public String academicTitle() {
        if (yearsOfExperience <= 5) {
            return "Assistant Professor";
        } else if (yearsOfExperience <= 10) {
            return "Associate Professor";
        } else {
            return "Professor";
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
