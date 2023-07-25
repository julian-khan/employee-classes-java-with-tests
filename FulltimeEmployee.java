public class FulltimeEmployee extends Employee {
    
    private float annualSalary;
    private boolean isPermanent;

    FulltimeEmployee() {
        super();
        this.annualSalary = 0;
        this.isPermanent = false;
    }

    FulltimeEmployee(String firstName, String lastName, int employeeId) {
        super(firstName, lastName, employeeId);
    }

    public float getAnnualSalary() {
        return this.annualSalary;
    }

    public boolean getIsPermanent() {
        return this.isPermanent;
    }

    public void setAnnualSalary(float salary) {
        if (!isValidSalary(salary)) {
            return;
        }
        this.annualSalary = salary;
    }

    private boolean isValidSalary(float salary) {
        if (25000f <= salary) {
            return true;
        }
        return false;
    }

}
