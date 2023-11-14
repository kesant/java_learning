import java.util.Date;

public class PacienteObraSocial extends Paciente implements Comparable<PacienteObraSocial> {
    private String nombreObraSocial;
    private int numeroAsociado;

    public PacienteObraSocial(Date fechaNacimiento, String nombre, String apellido, Consulta consulta, boolean primeraConsulta, String nombreObraSocial, int numeroAsociado) {
        super(fechaNacimiento, nombre, apellido, consulta, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(PacienteObraSocial otro) {
        return Integer.compare(this.numeroAsociado, otro.numeroAsociado);

    }
    public void resultadoComparacion(PacienteObraSocial otro){
        int comparacion=this.compareTo(otro);
        if (comparacion < 0) {
            System.out.println(this.numeroAsociado + " es menor que " + otro.numeroAsociado);
        } else if (comparacion > 0) {
            System.out.println(this.numeroAsociado + " es mayor que " + otro.numeroAsociado);
        } else {
            System.out.println(this.numeroAsociado + " es igual a " + otro.numeroAsociado);
        }

    }
    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }
}
