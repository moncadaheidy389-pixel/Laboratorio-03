import java.text.DecimalFormat;

public class Billetera {
    // Atributos privados ✅
    private String titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int contador;
    private int ingresosAceptados;
    private int gastosAceptados;
    private double totalIngresos;
    private double totalGastos;
    private DecimalFormat formato;

    // Constructor ✅
    public Billetera(String titular, int capacidadMaxima) {
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new Movimiento[capacidadMaxima];
        this.contador = 0;
        this.ingresosAceptados = 0;
        this.gastosAceptados = 0;
        this.totalIngresos = 0.0;
        this.totalGastos = 0.0;
        this.formato = new DecimalFormat("#,##0.00");
    }

    // Métodos públicos ✅
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public int getIngresosAceptados() { return ingresosAceptados; }
    public int getGastosAceptados() { return gastosAceptados; }
    public double getTotalIngresos() { return totalIngresos; }
    public double getTotalGastos() { return totalGastos; }

    // Validaciones + contadores + acumulados ✅
    public boolean registrarIngreso(double monto, String descripcion) {
        if (monto <= 0) {
            System.out.println("❌ Monto inválido: debe ser mayor a cero.");
            return false;
        }
        if (contador >= movimientos.length) {
            System.out.println("❌ Historial lleno.");
            return false;
        }
        saldo += monto;
        movimientos[contador] = new Movimiento("Ingreso", monto, descripcion);
        contador++;
        ingresosAceptados++;
        totalIngresos += monto;
        return true;
    }

    public boolean registrarGasto(double monto, String descripcion) {
        if (monto <= 0) {
            System.out.println("❌ Monto inválido: debe ser mayor a cero.");
            return false;
        }
        if (monto > saldo) {
            System.out.println("❌ Saldo insuficiente.");
            return false;
        }
        if (contador >= movimientos.length) {
            System.out.println("❌ Historial lleno.");
            return false;
        }
        saldo -= monto;
        movimientos[contador] = new Movimiento("Gasto", monto, descripcion);
        contador++;
        gastosAceptados++;
        totalGastos += monto;
        return true;
    }

    public void mostrarMovimientos() {
        System.out.println("\n📋 Historial — " + titular);
        if (contador == 0) {
            System.out.println("Sin movimientos registrados.");
            return;
        }
        for (int i = 0; i < contador; i++) {
            Movimiento m = movimientos[i];
            System.out.println((i + 1) + ". " + m.getTipo() +
                             " — $" + formato.format(m.getMonto()) +
                             " | " + m.getDescripcion());
        }
        System.out.println("----------------------------------");
        System.out.println("💰 Saldo: $" + formato.format(saldo));
        System.out.println("📊 Ingresos: " + ingresosAceptados + " | Total: $" + formato.format(totalIngresos));
        System.out.println("📊 Gastos:  " + gastosAceptados + " | Total: $" + formato.format(totalGastos));
    }
}