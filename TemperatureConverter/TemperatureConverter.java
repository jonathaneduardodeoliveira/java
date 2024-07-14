public class TemperatureConverter {
    // Constantes para os fatores de conversão
    private static final double FATOR1 = 9.0 / 5.0;
    private static final double FATOR2 = 32.0;

    // Função para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * FATOR1) + FATOR2;
    }

    public static void main(String[] args) {
        // Teste da função com alguns valores
        double celsius1 = 0.0;
        double celsius2 = 25.0;
        double celsius3 = 100.0;

        System.out.println(celsius1 + "°C em Fahrenheit é: " + celsiusParaFahrenheit(celsius1) + "°F");
        System.out.println(celsius2 + "°C em Fahrenheit é: " + celsiusParaFahrenheit(celsius2) + "°F");
        System.out.println(celsius3 + "°C em Fahrenheit é: " + celsiusParaFahrenheit(celsius3) + "°F");
    }
}

