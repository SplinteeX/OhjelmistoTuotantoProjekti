import org.junit.*;
import static org.junit.Assert.*;

public class StringManipulatorJesperTest {

    private StringManipulatorJesper manipulator;
    @BeforeClass
    public static void setUpBeforeClass() {
    }
    @AfterClass
    public static void tearDownAfterClass() {
    }
    @Before
    public void setUp() {
        manipulator = new StringManipulatorJesper();
    }
    @After
    public void tearDown() {
        manipulator = null;
    }
    @Test
    public void testReverse() {
        System.out.println("Testataan testReverse");
        // Testi 1
        String input = "ieH";
        String expected = "Hei";
        String result = manipulator.reverse(input);
        assertEquals(expected, result);

        // Testi 2 - Tyhjän merkkijonon testaus
        input = "";
        expected = "";
        result = manipulator.reverse(input);
        assertEquals(expected, result);

        // Testi 3 - Yhden merkin testaus
        input = "a";
        expected = "a";
        result = manipulator.reverse(input);
        assertEquals(expected, result);

        // Testi 4 - Null testaus
        input = null;
        result = manipulator.reverse(input);
        assertNull(result);
    }
    @Test
    public void testCapitalize() {
        System.out.println("Testataan testCapitalize");

        // Testi 1 - Pienillä kirjaimilla alkava merkkijono
        String input = "hei";
        String expected = "Hei";
        String result = manipulator.capitalize(input);
        assertEquals(expected, result);

        // Testi 2 - Isoilla kirjaimilla alkava merkkijono
        input = "Hei";
        expected = "Hei";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        // Testi 3 - Tyhjän merkkijonon testaus
        input = "";
        expected = "";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        // Testi 4 - Yhden merkin testaus
        input = "a";
        expected = "A";
        result = manipulator.capitalize(input);
        assertEquals(expected, result);

        // Testi 5 - Null testaus
        input = null;
        result = manipulator.capitalize(input);
        assertNull(result);
    }
}