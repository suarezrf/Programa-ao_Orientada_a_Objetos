package Atividade5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] strg) {
        Paciente p1 = new Paciente("Rogerio", "55-984291106");
        Consulta c1 = new Consulta(p1, java.time.LocalDate.now());

        Paciente p2 = new Paciente("Andre", "55-984216691");
        Consulta c2 = new Consulta(p2, java.time.LocalDate.now());

        c1.comprovante();
        c2.comprovante();
        c2.remarcar(LocalDate.of(2027,9,21));



    }
}
