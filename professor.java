package university;

public class Professor {
    private final String employeeId;
    private String name;
    private String specialization;
    private int yearsOfExperience;

    public Professor(String employeeId, String name, String specialization, int yearsOfExperience) {
        this.employeeId = employeeId;
        this.name = name;
        this.specialization = specialization;
        if (yearsOfExperience < 0 || yearsOfExperience > 50) {
            throw new IllegalArgumentException("Invalid years of experience. Must be between 0 and 50.");
        }
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience >= 0 && yearsOfExperience <= 50) {
            this.yearsOfExperience = yearsOfExperience;
        } else {
            System.out.println("Invalid years of experience");
        }
    }

    @Override
    public String toString() {
        return "EmployeeId: " + employeeId + 
               "\nName: " + name + 
               "\nSpecialization: " + specialization + 
               "\nYears of Experience: " + yearsOfExperience;
    }
}
