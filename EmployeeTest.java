import org.junit.Test;
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

    @Test
    @DisplayName("Check that the default constructor can be used")
    public void testUseDefaultConstructor() {
        Employee jane = new Employee();
        assertAll(
                "Check that the private instance variables are properly instantiated", 
                () -> assertTrue( jane.getFirstName() == ""),
                () -> assertTrue(jane.getLastName() == ""),
                () -> assertTrue(jane.getEmployeeId() == 0)
                );
    }
}
