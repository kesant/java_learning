import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Crear algunas consultas
        Consulta consulta1 = new Consulta(new Date(), "Cardiología", 10, 30);
        Consulta consulta2 = new Consulta(new Date(), "Dermatología", 11, 00);

        // Crear algunos pacientes
        PacienteParticular paciente1 = new PacienteParticular(new Date(), "Juan", "Pérez", consulta1, true, 500.0, "12065654889");
        PacienteObraSocial paciente2 = new PacienteObraSocial(new Date(), "Ana", "García", consulta2, false, "SaludTotal", 102);
        PacienteObraSocial paciente3 = new PacienteObraSocial(new Date(), "Luis", "Martinez", consulta1, true, "SaludTotal", 101);
        paciente3.resultadoComparacion(paciente2);
    }
}
