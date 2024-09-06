import org.junit.*;
import static org.junit.Assert.*;

public class StringManipulatorJesperTest {

    private StringManipulatorJesper manipulator;
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Running @BeforeClass - Set up shared resources");
        // Shared resources setup can be done here (if any)
    }
    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Running @AfterClass - Clean up shared resources");
        // Shared resources cleanup can be done here (if any)
    }
    @Before
    public void setUp() {
        System.out.println("Running @Before - Prepare for each test");
        manipulator = new StringManipulatorJesper();  // Initialize a new instance before each test
    }
    @After
    public void tearDown() {
        System.out.println("Running @After - Clean up after each test");
        manipulator = null;
    }
    @Test
    public void testReverse() {
        System.out.println("Running testReverse");

        String input = "hello";
        String expected = "olleh";
        String result = manipulator.reverse(input);
        assertEquals(expected, result);

        input = "";
        expected = "";
        result = manipulator.reverse(input);
        assertEquals(expected, result);

        input = "a";
        expected = "a";
        result = manipulator.reverse(input);
        assertEquals(expected, result);

        input = null;
        result = manipulator.reverse(input);
        assertNull(result);
    }
    @Test
    public void testCapitalize() {
        System.out.println("Running testCapitalize");

        String input = "hello";
        String expected = "Hello";
        String result = manipulator.capitalize(input);
        assertEquals(expected, result);

        input = "Hello";
        expected = "Hello";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        input = "";
        expected = "";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        input = "h";
        expected = "H";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        input = null;
        result = manipulator.capitalize(input);
        assertNull(result);
    }
}