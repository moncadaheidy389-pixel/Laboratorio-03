public class Contador {
    int valor;

    // Constructor: inicia el contador en cero
    public Contador() {
        valor = 0;
    }

    // Aumenta el valor en 1
    void aumentar() {
        valor++;
    }

    // Muestra el valor actual
    void mostrar() {
        System.out.println("Valor: " + valor);
    }

    // Prueba del contador
    public static void main(String[] args) {
        Contador visitas = new Contador();
        visitas.aumentar();
        visitas.aumentar();
        visitas.mostrar();

        System.out.println();

        Contador intentos = new Contador();
        intentos.mostrar();
    }
}