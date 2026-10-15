public class Main {

    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.titulo = "Cuentos gary";
        libro.autor = "Caracol";
        libro.paginas = 120;

        Libro libro2 = new Libro();
        
        libro2.titulo = "Caperusita rosa";
        libro2.autor = "Charles Perrault";
        libro2.paginas = 90;

        Libro libro3 = new Libro();

        libro3.titulo = "Los tres cerditos";
        libro3.autor = "Joseph Jacobs";
        libro3.paginas = 80;

        libro.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();
        
    }
    
}
