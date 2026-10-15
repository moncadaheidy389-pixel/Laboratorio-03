import java.text.DecimalFormat;

public class PruebaBilleteras {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        System.out.println("=== PRUEBA: DOS BILLETERAS INDEPENDIENTES ===\n");

        // Creamos dos instancias diferentes ✅
        Billetera billeteraAna = new Billetera("Ana", 20);
        Billetera billeteraLuis = new Billetera("Luis", 20);

        // Operaciones en Ana
        billeteraAna.registrarIngreso(150000, "Salario");
        billeteraAna.registrarGasto(45000, "Mercado");

        // Operaciones en Luis
        billeteraLuis.registrarIngreso(80000, "Trabajo extra");
        billeteraLuis.registrarGasto(25000, "Transporte");
        billeteraLuis.registrarGasto(10000, "Cine");

        // Mostramos que cada una mantiene su estado ✅
        System.out.println("--- BILLETERA DE ANA ---");
        System.out.println("Saldo: $" + formato.format(billeteraAna.getSaldo()));
        System.out.println("Ingresos: " + billeteraAna.getIngresosAceptados() + " | Gastos: " + billeteraAna.getGastosAceptados());

        System.out.println("\n--- BILLETERA DE LUIS ---");
        System.out.println("Saldo: $" + formato.format(billeteraLuis.getSaldo()));
        System.out.println("Ingresos: " + billeteraLuis.getIngresosAceptados() + " | Gastos: " + billeteraLuis.getGastosAceptados());

        // Confirmación de independencia ✅
        System.out.println("\n--- VERIFICACIÓN ---");
        boolean sonIndependientes = billeteraAna.getSaldo() != billeteraLuis.getSaldo();
        System.out.println("Cada billetera mantiene su propio estado: " + (sonIndependientes ? "✅ Correcto" : "❌ Error"));
    }
}