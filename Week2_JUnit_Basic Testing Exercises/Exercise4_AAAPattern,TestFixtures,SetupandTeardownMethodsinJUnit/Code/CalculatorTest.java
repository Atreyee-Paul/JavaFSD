import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup method - runs before each @Test
    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange
        System.out.println("Setup: New calculator created");
    }

    // Teardown method - runs after each @Test
    @After
    public void tearDown() {
        calculator = null;  // Cleanup
        System.out.println("Teardown: Calculator set to null");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(4, 3);

        // Assert
        assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}