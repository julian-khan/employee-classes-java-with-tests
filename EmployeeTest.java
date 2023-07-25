import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employeeJohn = new Employee("John", "Doe", 12435);

    @Test
    @DisplayName("Check that the Employee getFirstName method works")
    public void testGetFirstName() {
        assertTrue(employeeJohn.getFirstName() == "John");
    }
    
    @Test
    @DisplayName("Check that the Employee getLastName method works")
    public void testGetLastName() {
        assertTrue(employeeJohn.getLastName() == "Doe");
    }

    @Test
    @DisplayName("Check that the employee's ID can be retrieved")
    public void testGetEmployeeId() {
        assertTrue(employeeJohn.getEmployeeId() == 12435);
    }
    



}
