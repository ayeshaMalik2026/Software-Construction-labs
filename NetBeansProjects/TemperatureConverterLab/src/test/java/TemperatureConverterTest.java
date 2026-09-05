import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
        assertEquals(373.15, converter.celsiusToKelvin(100), 0.01);
    }

    @Test
    public void testRoundTrip() {
        double celsius = 25.0;

        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double result = converter.fahrenheitToCelsius(fahrenheit);

        assertEquals(celsius, result, 0.01);
    }
}
