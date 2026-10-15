public class Main {
    public static void main(String[] args) {
        Producto producto = null;
        
        // producto.mostrarDetalle(); // Esto da error si lo descomentas
        
        Producto producto2 = new Producto("Prueba", 5000, 2);
        producto2.mostrarDetalle();
    }
}

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    void mostrarDetalle() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
}