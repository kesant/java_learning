import java.util.Date;

public class PacienteParticular extends Paciente {
    private double costoConsulta;
    private String dni;

    public PacienteParticular(Date fechaNacimiento, String nombre, String apellido, Consulta consulta, boolean primeraConsulta, double costoConsulta, String dni) {
        super(fechaNacimiento, nombre, apellido, consulta, primeraConsulta);
        this.costoConsulta = costoConsulta;
        this.dni = dni;
    }

}
