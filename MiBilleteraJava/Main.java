import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#,##0.00");

        System.out.println("===== MI BILLETERA JAVA =====");
        System.out.print("Nombre del titular: ");
        String titular = teclado.nextLine();

        Billetera miBilletera = new Billetera(titular, 50);
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Registrar Ingreso");
            System.out.println("2. Registrar Gasto");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Ver Historial");
            System.out.println("5. Ver Estadísticas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Monto: $");
                    double ingreso = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Descripción: ");
                    String descIng = teclado.nextLine();
                    if (miBilletera.registrarIngreso(ingreso, descIng)) {
                        System.out.println("✅ Ingreso registrado.");
                    }
                    break;

                case 2:
                    System.out.print("Monto: $");
                    double gasto = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.print("Descripción: ");
                    String descGas = teclado.nextLine();
                    if (miBilletera.registrarGasto(gasto, descGas)) {
                        System.out.println("✅ Gasto registrado.");
                    }
                    break;

                case 3:
                    System.out.println("💰 Saldo: $" + formato.format(miBilletera.getSaldo()));
                    break;

                case 4:
                    miBilletera.mostrarMovimientos();
                    break;

                case 5:
                    System.out.println("\n📊 ESTADÍSTICAS — " + miBilletera.getTitular());
                    System.out.println("Ingresos aceptados: " + miBilletera.getIngresosAceptados() + " → $" + formato.format(miBilletera.getTotalIngresos()));
                    System.out.println("Gastos aceptados:  " + miBilletera.getGastosAceptados() + " → $" + formato.format(miBilletera.getTotalGastos()));
                    System.out.println("Saldo actual:      $" + formato.format(miBilletera.getSaldo()));
                    break;

                case 6:
                    System.out.println("👋 ¡Hasta pronto, " + miBilletera.getTitular() + "!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        } while (opcion != 6);

        teclado.close();
    }
}   