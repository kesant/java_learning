import java.util.Date;

public class Consulta {
    private Date fechaConsulta;
    private String especialidad;
    private int hora;
    private int minuto;

    public Consulta(Date fechaConsulta, String especialidad, int hora, int minuto) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minuto = minuto;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
}
