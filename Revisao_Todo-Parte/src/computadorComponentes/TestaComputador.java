package computadorComponentes;

import clinicaMedica.Consulta;
import clinicaMedica.Medico;
import clinicaMedica.Paciente;

import java.time.LocalDateTime;

public class TestaComputador {
    public static void main(String[] args){
        Computador com1 = new Computador(52, "Uriel", new Processador("Sony", "A50", "150hz"));
        System.out.println(com1);
        System.out.println(com1.getProcessador());


    }
}
