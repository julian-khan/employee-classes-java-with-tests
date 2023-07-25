import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employeeJohn = new Employee("John", "Doe", 12435);

    @Test
    @DisplayName("Check that the Employee object's getFirstName method works")
    public void testGetFirstName() {
        assertTrue(employeeJohn.getFirstName() == "John");
    } 



}
