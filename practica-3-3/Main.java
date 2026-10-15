public class Main {
    public static void main(String[] args) {
        Billetera laura = new Billetera("Laura");

        System.out.println("Titular: " + laura.getTitular());
        System.out.println("Saldo inicial: $" + laura.getSaldo());

        boolean ingreso1 = laura.registrarIngreso(100000);
        boolean ingreso2 = laura.registrarIngreso(-5000);

        System.out.println("\nIngreso de 100000: " + (ingreso1 ? "Hecho" : "Rechazado"));
        System.out.println("Ingreso de -5000: " + (ingreso2 ? "Hecho" : "Rechazado"));

        boolean gasto1 = laura.registrarGasto(30000);
        boolean gasto2 = laura.registrarGasto(90000);

        System.out.println("Gasto de 30000: " + (gasto1 ? "Hecho" : "Rechazado"));
        System.out.println("Gasto de 90000: " + (gasto2 ? "Hecho" : "Rechazado"));

        System.out.println("\n--- Resumen ---");
        System.out.println("Saldo final: $" + laura.getSaldo());
        System.out.println("Ingresos: " + laura.getCantidadIngresos());
        System.out.println("Gastos: " + laura.getCantidadGastos());
    }
}