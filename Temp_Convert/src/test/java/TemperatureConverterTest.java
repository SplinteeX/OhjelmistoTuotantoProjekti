import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void fahrenheitToCelsius() {
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    public void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
    }
}