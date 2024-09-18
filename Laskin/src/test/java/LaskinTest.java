import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class LaskinTest {

    private Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeEach
    public void clearCalculator() {
        laskin.nollaa();
    }

    @Test
    public void testLisaa() {
        laskin.lisaa(1.5);
        laskin.lisaa(2.5);
        assertEquals(4.0, laskin.annaTulos(), DELTA, "Lukujen 1.5 ja 2.5 summa väärin");
    }

    @Test
    public void testVahenna() {
        laskin.lisaa(10.0);
        laskin.vahenna(2.5);
        assertEquals(7.5, laskin.annaTulos(), DELTA, "Lukujen 10.0 ja 2.5 erotus väärin");
    }

    @Test
    @DisplayName("Testaa jakolasku 8.0 / 2.0")
    public void testJaa() {
        laskin.lisaa(8.0);
        laskin.jaa(2.0);
        assertEquals(4.0, laskin.annaTulos(), DELTA, "Jakolasku 8.0/2.0 väärin");
    }

    @Test
    @DisplayName("Testaa nollallajako")
    public void testJaaNollalla() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.jaa(0.0));
        assertEquals("Nollalla ei voi jakaa", poikkeus.getMessage());
    }

    @Test
    @DisplayName("Testaa kertolasku 2.0 * 3.0")
    public void testKerro() {
        laskin.lisaa(2.0);
        laskin.kerro(3.0);
        assertEquals(6.0, laskin.annaTulos(), DELTA, "Kertolasku 2.0 * 3.0 väärin");
    }

    @Test
    @DisplayName("Testaa neliö 4.0")
    public void testNelio() {
        laskin.nelio(4.0);
        assertEquals(16.0, laskin.annaTulos(), DELTA, "Luvun 4.0 neliö väärin");
    }

    @Test
    @DisplayName("Testaa neliöjuuri 4.0")
    public void testNeliojuuri() {
        laskin.neliojuuri(4.0);
        assertEquals(2.0, laskin.annaTulos(), DELTA, "Luvun 4.0 neliöjuuri väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.neliojuuri(-4.0));
        assertEquals("Negatiiviselle luvulle ei voi laskea neliöjuurta", poikkeus.getMessage());
    }
}
