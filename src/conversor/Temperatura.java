package conversor;

/**
 *
 * @author William
 */
public class Temperatura {

    /**
     * Converter Celcius em Kelvin
     *
     * @param valor - Recebe como Parametro um Double
     * @return Double - Retorna um Double
     */
    public static Double celciusXKelvin(Double valor) {
        Double kelvin = valor + 273.00;
        return kelvin;

    }

    /**
     * Converter Celcius em Fahrenheit
     *
     * @param valor - Recebe como parametro um Double
     * @return Double - Retorna um Double
     */
    public static Double celciusXFahrenheit(Double valor) {
        Double Fahrenheit = (valor * 1.8) + 32.00;
        return Fahrenheit;

    }
}
