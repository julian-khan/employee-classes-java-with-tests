import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class FulltimeEmployeeTest {

    private FulltimeEmployee bob

     = new FulltimeEmployee("Bob", "Kent", 41234);

    @Test
    @DisplayName("Check that the Employee getFirstName method works")
    public void testGetFirstName() {
        assertTrue(bob

        .getFirstName() == "Bob");
    }
    
    @Test
    @DisplayName("Check that the Employee getLastName method works")
    public void testGetLastName() {
        assertTrue(bob

        .getLastName() == "Kent");
    }

    @Test
    @DisplayName("Check that the employee's ID can be retrieved")
    public void testGetEmployeeId() {
        assertTrue(bob

        .getEmployeeId() == 12435);
    }

    @Test
    @DisplayName("Check that the default constructor can be used")
    public void testUseDefaultConstructor() {
        Employee todd = new FulltimeEmployee();
        assertAll(
                "Check that the private instance variables are properly instantiated", 
                () -> assertTrue( todd.getFirstName() == ""),
                () -> assertTrue(todd.getLastName() == ""),
                () -> assertTrue(todd.getEmployeeId() == 0)
                );
    }
}
