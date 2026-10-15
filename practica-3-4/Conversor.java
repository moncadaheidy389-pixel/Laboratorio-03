public class Conversor {
    // Convertir Celsius a Fahrenheit
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convertir Fahrenheit a Celsius
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convertir kilómetros a millas
    public double kmAMillas(double km) {
        return km * 0.621371;
    }

    // Convertir millas a kilómetros
    public double millasAKm(double millas) {
        return millas / 0.621371;
    }

    public static void main(String[] args) {
        Conversor conv = new Conversor();

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("25 °C = " + conv.celsiusAFahrenheit(25) + " °F");
        System.out.println("77 °F = " + conv.fahrenheitACelsius(77) + " °C");

        System.out.println("\n=== Conversor de Distancia ===");
        System.out.println("10 km = " + conv.kmAMillas(10) + " millas");
        System.out.println("10 millas = " + conv.millasAKm(10) + " km");
    }
}