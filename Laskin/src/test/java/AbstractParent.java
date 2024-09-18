import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Tässä esitellään @BeforeEach, @AfterEach, @BeforeAll ja @AfterAll annotaatioita
 */
public abstract class AbstractParent {

    @BeforeAll
    public static void startTestSystem() {
        System.out.println("@BeforeAll TESTAAMINEN ALKAA.");
    }

    @AfterAll
    public static void stopTestSystem() {
        System.out.println("@AfterAll TESTAAMINEN VALMIS.");
    }

    @BeforeEach
    public void initTestSystem() {
        System.out.println("  @BeforeEach Käynnistä uusi testimetodi.");
    }

    @AfterEach
    public void cleanTestSystem() {
        System.out.println("  @AfterEach Testimetodi suoritettu.");
    }
}
