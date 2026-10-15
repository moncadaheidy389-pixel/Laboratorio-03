public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private int paginaActual;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginaActual = 1;
    }

    // Métodos para consultar
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    // Avanzar páginas
    public boolean avanzarPaginas(int cantidad) {
        if (cantidad > 0 && paginaActual + cantidad <= paginas) {
            paginaActual += cantidad;
            return true;
        }
        return false;
    }

    // Retroceder páginas
    public boolean retrocederPaginas(int cantidad) {
        if (cantidad > 0 && paginaActual - cantidad >= 1) {
            paginaActual -= cantidad;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez", 400);

        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Total páginas: " + miLibro.getPaginas());
        System.out.println("Página actual: " + miLibro.getPaginaActual());

        miLibro.avanzarPaginas(50);
        System.out.println("\nTras avanzar 50 páginas: " + miLibro.getPaginaActual());

        miLibro.retrocederPaginas(20);
        System.out.println("Tras retroceder 20 páginas: " + miLibro.getPaginaActual());

        boolean llegada = miLibro.avanzarPaginas(400);
        System.out.println("Intentar pasar la última página: " + (llegada ? "Logrado" : "No se puede, fin del libro"));
    }
}