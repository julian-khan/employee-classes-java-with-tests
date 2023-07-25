public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.employeeId = 0;
    }

    public Employee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    /* Setter methods would normally be required for a class
    such as this to modify instances' internal state. */
}