public class ProductoTienda {
    private String nombre;
    private double precio;
    private int stock;

    public ProductoTienda(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public boolean vender(int cantidad) {
        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        return false;
    }

    public void reponer(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public double valorTotal() {
        return precio * stock;
    }

    public static void main(String[] args) {
        ProductoTienda producto = new ProductoTienda("Cuaderno", 8500, 15);

        System.out.println("=== Producto ===");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Stock inicial: " + producto.getStock());
        System.out.println("Valor total: $" + producto.valorTotal());

        boolean venta = producto.vender(5);
        System.out.println("\nVenta de 5 unidades: " + (venta ? "Realizada" : "Sin existencias suficientes"));
        System.out.println("Stock actual: " + producto.getStock());

        producto.reponer(10);
        System.out.println("Tras reponer 10 unidades: " + producto.getStock());
        System.out.println("Valor actual: $" + producto.valorTotal());
    }
}