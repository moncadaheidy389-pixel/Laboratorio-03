public class Termometro {
    double temperaturaCelsius;

    public Termometro(double temperaturaInicial) {
        this.temperaturaCelsius = temperaturaInicial;
    }

    void mostrarCelsius() {
        System.out.println(temperaturaCelsius + " °C");
    }

    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Termometro t1 = new Termometro(0);
        Termometro t2 = new Termometro(25);

        System.out.println(t1.temperaturaCelsius + " °C -> " + t1.convertirAFahrenheit() + " °F");
        System.out.println(t2.temperaturaCelsius + " °C -> " + t2.convertirAFahrenheit() + " °F");
    }
}