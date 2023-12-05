public class Oferente implements Observer {
    private String nombre;
    private String apellido;
    private String dni;
    private double montoTope;

    public Oferente(String nombre, String apellido, String dni, double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }


    @Override
    public void update(double monto) {
        if (monto <= montoTope) {
            System.out.println(this.nombre + " ofrece: " + monto);
        }
    }
}
