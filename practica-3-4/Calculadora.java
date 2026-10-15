public class Calculadora {

    // Suma
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplicación
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // División con validación
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Calculadora ===");
        System.out.println("Suma: 8 + 4 = " + calc.sumar(8, 4));
        System.out.println("Resta: 8 - 4 = " + calc.restar(8, 4));
        System.out.println("Multiplicación: 8 × 4 = " + calc.multiplicar(8, 4));
        System.out.println("División: 8 ÷ 4 = " + calc.dividir(8, 4));
        System.out.println("División entre cero: 8 ÷ 0 = " + calc.dividir(8, 0));
    }
}   