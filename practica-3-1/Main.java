public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto();

        producto.nombre = "Teclado";
        producto.precio = 85000;
        producto.cantidad = 3;

        Producto segundo = new Producto();

        segundo.nombre = "Mause";
        segundo.precio = 18000;
        segundo.cantidad = 10;

        Producto tersero = new Producto();

        tersero.nombre = "USB";
        tersero.precio = 240000;
        tersero.cantidad = 50;

        
        Producto cuarto = new Producto();

        cuarto.nombre = "DVD";
        cuarto.precio = 4500000;
        cuarto.cantidad = 10;

        producto.mostrarDetalle();
        segundo.mostrarDetalle();
        tersero.mostrarDetalle();
        cuarto.mostrarDetalle();

        System.out.println("Subtotal primero: $" + producto.calcularSubtotal());
        System.out.println("Subtotal segundo: $" + segundo.calcularSubtotal());
    }
}