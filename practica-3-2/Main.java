public class Main {
    public static void main(String[] args) {
        // Creamos el producto
        Producto miProducto = new Producto("Televisor", 85000, 3);

        // Mostramos sus datos
        System.out.println("Nombre: " + miProducto.nombre);
        System.out.println("Precio: $" + miProducto.precio);
        System.out.println("Cantidad: " + miProducto.cantidad);
        System.out.println("Subtotal: $" + (miProducto.precio * miProducto.cantidad));
    }
}