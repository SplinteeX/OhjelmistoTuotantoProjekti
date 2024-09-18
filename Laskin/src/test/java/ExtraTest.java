import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.MethodSource;

public class ExtraTest {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), "Nollaus ei onnistunut");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 5})
    public void testNelio(int input) {
        int expected = input * input;
        laskin.nelio(input);
        assertEquals(expected, laskin.annaTulos(), DELTA, "Luvun " + input + " neliö väärin");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 9, 16})
    @DisplayName("Testaa neliöjuuri")
    public void testNeliojuuri(int input) {
        double expected = Math.sqrt(input);
        laskin.neliojuuri(input);
        assertEquals(expected, laskin.annaTulos(), DELTA, "Luvun " + input + " neliöjuuri väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        assertThrows(ArithmeticException.class, () -> {
            laskin.neliojuuri(-1);
        }, "Negatiivinen syöte ei aiheuttanut poikkeusta");
    }
}
