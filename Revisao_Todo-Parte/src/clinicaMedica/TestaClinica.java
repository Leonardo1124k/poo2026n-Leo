package clinicaMedica;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args){
        Medico me1 = new Medico(101, "Igor", "Cirurgia");
        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 13, 10);
        Paciente pa1 = new Paciente(52, "Uriel", "56551");

        Consulta co1 = new Consulta(data, 25.0f, me1, pa1);


        System.out.println(co1.toString());
    }

}


