public class CuentaPuntos {
    private String nombreUsuario;
    private int puntos;
    private int nivel;

    public CuentaPuntos(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.puntos = 0;
        this.nivel = 1;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getNivel() {
        return nivel;
    }

    public void agregarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
            if (puntos >= nivel * 100) {
                nivel++;
            }
        }
    }

    public boolean canjearPuntos(int cantidad) {
        if (cantidad > 0 && puntos >= cantidad) {
            puntos -= cantidad;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CuentaPuntos jugador = new CuentaPuntos("Ana");

        System.out.println("Usuario: " + jugador.getNombreUsuario());
        System.out.println("Nivel inicial: " + jugador.getNivel());
        System.out.println("Puntos iniciales: " + jugador.getPuntos());

        jugador.agregarPuntos(50);
        jugador.agregarPuntos(60);
        System.out.println("\nTras sumar 110 puntos:");
        System.out.println("Puntos: " + jugador.getPuntos());
        System.out.println("Nivel: " + jugador.getNivel());

        boolean canje = jugador.canjearPuntos(30);
        System.out.println("\nCanjear 30 puntos: " + (canje ? "Hecho" : "Sin puntos suficientes"));
        System.out.println("Puntos actuales: " + jugador.getPuntos());
    }
}