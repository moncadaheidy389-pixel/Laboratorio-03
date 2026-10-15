public class Estudiante {
    String nombre;
    String ficha;
    int trimestre;
    double promedio;

    public Estudiante(String nombre, String ficha, int trimestre, double promedio) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.trimestre = trimestre;
        this.promedio = promedio;
    }

    void mostrarPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ficha: " + ficha);
        System.out.println("Trimestre: " + trimestre);
        System.out.println("Promedio: " + promedio);
    }

    boolean aprobo() {
        return promedio >= 3.0;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("María", "SENA-001", 3, 2.8);
        Estudiante e2 = new Estudiante("Pedro", "SENA-002", 3, 4.1);

        e1.mostrarPerfil();
        System.out.println("¿Aprobó? " + e1.aprobo());

        System.out.println();

        e2.mostrarPerfil();
        System.out.println("¿Aprobó? " + e2.aprobo());
    }
}