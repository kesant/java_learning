import java.util.Date;

public abstract class Paciente {
    private Date fechaNacimiento;
    private String nombre;
    private String apellido;
    private Consulta consulta;
    private boolean primeraConsulta;

    public Paciente(Date fechaNacimiento, String nombre, String apellido, Consulta consulta, boolean primeraConsulta) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consulta = consulta;
        this.primeraConsulta = primeraConsulta;
    }

    public boolean necesitaEvaluacionInicial() {
        return primeraConsulta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public boolean isPrimeraConsulta() {
        return primeraConsulta;
    }

    public void setPrimeraConsulta(boolean primeraConsulta) {
        this.primeraConsulta = primeraConsulta;
    }
}
